package com.scu.Controller.ManagerController;
import com.alibaba.fastjson.JSON;
import com.scu.Dao.DBUtil;
import com.scu.Entity.ManagerEntity.TeacherCourse;
import org.apache.ibatis.session.SqlSession;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/showTeacherCourse")
public class showTeacherCourse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("utf8");
            response.setContentType("text/html;character=utf8");
            response.setCharacterEncoding("UTF-8");
            SqlSession sqlsession = DBUtil.getSqlSession();
            List<TeacherCourse> teacherCourseList = new ArrayList<>();
            PrintWriter out = response.getWriter();
            teacherCourseList = sqlsession.selectList("selectAllCourse");
        for (TeacherCourse teacherCourse:teacherCourseList) {
            Integer id = teacherCourse.getTeacherID();
            String name = sqlsession.selectOne("getTeacherByID",id);
            teacherCourse.setTeacherName(name);
        }
            String str = JSON.toJSONString(teacherCourseList);
            System.out.println(str);
            out.println(str);
    }
}
