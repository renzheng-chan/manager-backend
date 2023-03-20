package scu.com.demo.servlet;

import com.alibaba.fastjson.JSON;
import scu.com.demo.entity.*;
import scu.com.demo.service.*;
import scu.com.demo.service.impl.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/teacherservlet.do")
public class TeacherServlet extends HttpServlet {

    CourseService courseService = new CourseServiceImpl();
    TeacherService teacherService = new TeacherServiceImpl();
    ScoreService scoreService = new ScoreServiceImpl();
    ApprovalService approvalService = new ApprovalServiceImpl();
    NoticeService noticeService = new NoticeServiceImpl();
    StudentService studentService = new StudentServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        System.out.println("进入Post");
        String opt = request.getParameter("opt");
        if(opt == null || "".equals(opt)){
            System.out.println("opt获取错误");
            return;
        }else {
            switch (opt) {
                //测试mybatis集成servlet是否成功
                case "getCourseInfo":
                    getCourseById(request, response);
                    break;
                case "getTimetable":
                    getTimeTable(request, response);
                    break;
                case "getPersonalInfo":
                    getPersonalInfo(request, response);
                    break;
                case "getStuScore":
                    getStuScore(request, response);
                    break;
                case "sendApproval":
                    sendApproval(request,response);
                    break;
                case "getNotice":
                    getNotice(request,response);
                    break;
            }
        }
    }

    private void getNotice(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/json");
        System.out.println("进入getNotice方法");

        List<Notice> notice = noticeService.getNotice();
        PrintWriter writer = response.getWriter();
        if(notice == null){
            System.out.println("无通知！");
            writer.write(
                    "{\"message\":\"暂无通知\"}"
            );
        }
        else{
            System.out.println("查询成功!");
            writer.write(JSON.toJSONString(notice));
        }
        writer.flush();
        writer.close();
    }

    private void sendApproval(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/json");
        System.out.println("进入sendApproval方法");
        String applicantionTime = request.getParameter("applicationTime");
        String applicationContent = request.getParameter("applicationContent");

        Approval approval = new Approval();
        approval.setApplicationtime(applicantionTime);
        approval.setApplicationcontent(applicationContent);

        HttpSession session = request.getSession();
        if(session == null)
            System.out.println("session失效！");

        User user =(User) session.getAttribute("user");
        approval.setApplicantid(user.getAccount());
        //获取申请人姓名
        Teacher teacher = new Teacher();
        teacher.setTeacherid(user.getAccount());
        Teacher teacherGetInfo = teacherService.getPersonalInfo(teacher);
        approval.setApplicantname(teacherGetInfo.getTeachername());
        System.out.println("开始插入");
        PrintWriter writer = response.getWriter();
        int i = approvalService.addApproval(approval);

        if(i == 0){
            System.out.println("新增失败");
            writer.write(
                    "{\"message\":\"新增失败\"}"
            );
        }
        else {
            System.out.println("新增成功");
            writer.write(
                    "{\"message\":\"新增成功\"}"
            );
        }
        writer.flush();
        writer.close();
    }

    private void getStuScore(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/json");
        System.out.println("进入getStuScore方法");
        String courseId = request.getParameter("courseID");
        int courseid_int = Integer.parseInt(courseId);
        System.out.println(courseid_int);
        Score score = new Score();
        score.setCourseid(courseid_int);
        System.out.println("准备获取session");
        HttpSession session = request.getSession();
        if(session == null)
            System.out.println("session失效！");
        System.out.println("session获取成功");
        User user =(User) session.getAttribute("user");
        score.setTeacherid(user.getAccount());
        List<Score> stuScore = scoreService.getStuScore(score);
        PrintWriter writer = response.getWriter();
        Course course = new Course();
        Student student = new Student();
        if(stuScore == null){
            System.out.println("查询失败！");
            writer.write("{\"message\":\"无该课程!\"}");
        }
        else{
            System.out.println("查询成功!");
            writer.write("[");
            for (Score score_each: stuScore) {
                course.setCourseid(score_each.getCourseid());
                course.setTeacherid(user.getAccount());
                student.setStuid(score_each.getStuid());
                List<Course> course_info = courseService.getCourseById(course);
                if(course_info == null){
                    writer.write("{\"message\":\"课程信息不匹配!\"}");
                }
                Student student_info = studentService.getStudentById(student);
                if(student_info == null){
                    writer.write("{\"message\":\"学生信息不匹配!\"}");
                }
                writer.write(
                        "{\"message\":\"查询成功\""+
                                ",\"courseID\":"+score_each.getCourseid()+
                                ",\"courseName\":\""+course_info.get(0).getCoursename()+"\""+
                                ",\"stuID\":"+score_each.getStuid()+
                                ",\"stuName\":\""+student_info.getStuname()+"\""+
                                ",\"score\":"+score_each.getScore()+
                                "}"
                );
                if(stuScore.lastIndexOf(score_each) != stuScore.size()-1){
                    writer.write(",");
                }
            }
            writer.write("]");
        }
        writer.flush();
        writer.close();
    }

    private void getPersonalInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/json");
        System.out.println("进入getPersonalInfo方法");
        Teacher teacher = new Teacher();
        HttpSession session = request.getSession();
        User user =(User) session.getAttribute("user");
        teacher.setTeacherid(user.getAccount());
        Teacher teacherGetInfo = teacherService.getPersonalInfo(teacher);
        PrintWriter writer = response.getWriter();
        if(teacherGetInfo == null){
            System.out.println("查询失败！");
            writer.write(
                    "{\"message\":\"查询失败\"}"
            );
        }
        else{
            System.out.println("查询成功!");
            writer.write(
                    "{\"message\":\"查询成功\""+
                            ",\"teacherID\":"+teacherGetInfo.getTeacherid()+
                            ",\"teacherName\":\""+teacherGetInfo.getTeachername()+"\""+
                            ",\"teacherAge\":"+teacherGetInfo.getTeacherage()+
                            ",\"teacherSex\":\""+teacherGetInfo.getTeachersex()+"\""+
                            ",\"teacherOBTime\":\""+teacherGetInfo.getTeacherobtime()+"\""+
                            ",\"teacherTitle\":\""+teacherGetInfo.getTeachertitle()+"\""+
                            ",\"teacherDept\":\""+teacherGetInfo.getTeacherdept()+"\""+"}"
            );
        }
        writer.flush();
        writer.close();
    }



    private void getTimeTable(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/json");
        System.out.println("进入getTimeTable方法");
        Course course = new Course();
        HttpSession session = request.getSession();
        if(session == null)
            System.out.println("session失效！");
        User user =(User) session.getAttribute("user");
        course.setTeacherid(user.getAccount());
        List<Course> allCourse = courseService.getAll(course);
        PrintWriter writer = response.getWriter();
        if(allCourse == null){
            System.out.println("查询为空！");
            writer.write(
                    "{\"message\":\"该课表为空\""+
                            "}"
            );
        }
        else{
            System.out.println("查询成功!");
            writer.write("[");
            for (Course course_each: allCourse) {
                writer.write(
                        "{\"message\":\"查询成功\""+
                                ",\"courseID\":"+course_each.getCourseid()+
                                ",\"courseName\":\""+course_each.getCoursename()+"\""+
                                ",\"SJDD\":\""+course_each.getCoursetime()+","+course_each.getCourseroom()+"\""+
                                "}"
                );
                if(allCourse.lastIndexOf(course_each) != allCourse.size()-1){
                    writer.write(",");
                }
            }
            writer.write("]");

        }
        writer.flush();
        writer.close();
    }

    private void getCourseById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json");
        System.out.println("进入getCourseById方法");
        String courseId = request.getParameter("courseID");
        System.out.println(courseId);
        String courseName = request.getParameter("courseName");
        int courseid_int = Integer.parseInt(courseId);
        System.out.println(courseid_int);
        Course course = new Course();
        course.setCourseid(courseid_int);
        course.setCoursename(courseName);
        System.out.println("准备获取session");
        HttpSession session = request.getSession();
        System.out.println("获取session成功");
        System.out.println(session);
        if(session == null)
            System.out.println("session失效！");
        User user =(User) session.getAttribute("user");
        System.out.println(user);
        System.out.println(user.getAccount()+user.getPassword());
        course.setTeacherid(user.getAccount());
        List<Course> courseBy_Id = courseService.getCourseById(course);
        Teacher teacher = new Teacher();
        PrintWriter writer = response.getWriter();
        if(courseBy_Id == null || courseBy_Id.size() == 0){
            System.out.println("查询失败！");
            writer.write("[{\"message\":\"查询失败，课程ID或课程名错误\"}]");
        }
        else{
            System.out.println("查询成功!");
            writer.write("[");
            for(Course courseById:courseBy_Id) {
                teacher.setTeacherid(courseById.getTeacherid());
                Teacher teacher_info = teacherService.getPersonalInfo(teacher);

                writer.write(
                        "{\"message\":\"查询成功\"" +
                                ",\"courseID\":" + courseById.getCourseid() +
                                ",\"courseName\":\"" + courseById.getCoursename() + "\"" +
                                ",\"teacherID\":" + courseById.getTeacherid() +
                                ",\"teacherName\":\"" + teacher_info.getTeachername() + "\"" +
                                ",\"courseTime\":\"" + courseById.getCoursetime() + "\"" +
                                ",\"courseCredit\":" + courseById.getCoursecredit() +
                                ",\"courseRoom\":\"" + courseById.getCourseroom() + "\"" +
                                ",\"courseDescription\":\"" + courseById.getCoursedescription() + "\"" + "}"
                );
                if(courseBy_Id.indexOf(courseById) != courseBy_Id.size()-1){
                    writer.write(",");
                }
            }
            writer.write("]");
        }
        writer.flush();
        writer.close();
    }

}
