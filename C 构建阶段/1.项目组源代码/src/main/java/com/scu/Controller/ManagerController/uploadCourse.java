package com.scu.Controller.ManagerController;
import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.Teacher;
import com.scu.Service.ManagerService.courseService.uploadCourseService;
import org.apache.ibatis.session.SqlSession;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.*;
import java.util.List;
import java.util.Random;

@WebServlet("/uploadCourse")
public class uploadCourse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("utf8");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;character=utf8");
            response.setCharacterEncoding("UTF-8");
          try{
              Random random = new Random();
            Integer courseID= random.nextInt(100);
            Integer teacherID= random.nextInt(100);
            Integer courseCredit= random.nextInt(5);
            SqlSession sqlsession = DBUtil.getSqlSession();
            if(request.getParameter("courseID") != null && !"".equals(request.getParameter("courseID"))) {
            courseID = Integer.valueOf(request.getParameter("courseID"));
            }
            String courseName = request.getParameter("courseName");
        if(request.getParameter("teacherID") != null && !"".equals(request.getParameter("teacherID"))) {
            teacherID = Integer.valueOf(request.getParameter("teacherID"));
        }
            String courseTime = request.getParameter("courseTime");
        if(request.getParameter("courseCredit") != null && !"".equals(request.getParameter("courseCredit"))) {
            courseCredit = Integer.valueOf(request.getParameter("courseCredit"));
        }
        String courseRoom = request.getParameter("courseRoom");
        String courseDescription = request.getParameter("courseDescription");
        System.out.println(teacherID);
        //判断teacherID是否存在
        List<Teacher> teacherlist = sqlsession.selectList("selectTeacherByID",teacherID);
        if(teacherlist==null) {
            response.sendRedirect("demo/index/adminis_pages/courseManage.html");
        }else{
            if (uploadCourseService.processUpload(courseID, courseName, teacherID, courseCredit, courseRoom, courseTime, courseDescription)) {
                //上传成功
                response.sendRedirect("demo/index/adminis_pages/courseUploadSuccess.html");
            } else {
                //上传失败
                response.sendRedirect("demo/index/adminis_pages/courseUploadFail.html");
            }
        }
    }catch(Exception e){
              response.sendRedirect("demo/index/adminis_pages/TeacherIDFail.html");
          }
    }
}

