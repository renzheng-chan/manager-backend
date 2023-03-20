package com.scu.Controller;

import com.alibaba.fastjson.JSON;
import com.scu.Dao.*;
import com.scu.Entity.*;
import scu.com.demo.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/stuIndex")
public class stuServlet extends HttpServlet {
    private stuScoreDao stuScoreDao = new stuScoreDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        String opt = req.getParameter("opt");
        System.out.println(opt);
        if(opt == null || "".equals(opt)){
            return;
        }
        else {
            if (opt.equals("getStuScore")) {
                this.getStuScore(req, resp);
            } else if (opt.equals("getNotice")) {
                this.getNotice(req, resp);
            } else if (opt.equals("getStuInfo")) {
                this.getStuInfo(req, resp);
            } else if (opt.equals("getStuExam")) {
                this.getStuExam(req, resp);
            } else if (opt.equals("getStuCourse")) {
                this.getStuCourse(req, resp);
            }
        }
    }

    private int getStuID(HttpServletRequest req){
//        System.out.println("进入");
        //获取session
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
//        System.out.println(user.getAccount());
//        if(user==null){
//            System.out.println("空");
//        }
//        System.out.println(user.getAccount()+user.getPassword());
        int stuID = user.getAccount();
        return stuID;
    }

    private void getStuScore(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException {
        //设置格式
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        int stuID = getStuID(req);

        stuScoreDao getScore = new stuScoreDao();
        List<Score> list = getScore.scoreFind(stuID);

        String jsonStr = JSON.toJSONString(list);
        System.out.println(jsonStr);
        try{
            PrintWriter writer = resp.getWriter();
            writer.write(jsonStr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getStuInfo(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        int stuID = getStuID(req);

        stuInfoDao getInfo = new stuInfoDao();
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(getInfo.stuFind(stuID));

        String jsonStr = JSON.toJSONString(student);

        try{
            PrintWriter writer = resp.getWriter();
            writer.write(jsonStr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getNotice(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        noticeDao noticeDao = new noticeDao();
        List<Notice> notices = noticeDao.Load();

        String jsonStr = JSON.toJSONString(notices);

        System.out.println(jsonStr);
        try{
            PrintWriter writer = resp.getWriter();
            writer.write(jsonStr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getStuCourse(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        int stuID = getStuID(req);

        stuCourseDao stuCourseDao = new stuCourseDao();
        List<Course> courses = stuCourseDao.stuFind(stuID);

        String jsonStr = JSON.toJSONString(courses);

        try{
            PrintWriter writer = resp.getWriter();
            writer.write(jsonStr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getStuExam(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        int stuID = getStuID(req);

        stuExamDao stuExamDao = new stuExamDao();
        List<Exam> exams = stuExamDao.examFind(stuID);

        String jsonStr = JSON.toJSONString(exams);

        try{
            PrintWriter writer = resp.getWriter();
            writer.write(jsonStr);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
