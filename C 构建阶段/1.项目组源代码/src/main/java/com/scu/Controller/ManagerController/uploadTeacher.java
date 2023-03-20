package com.scu.Controller.ManagerController;
import com.scu.Service.ManagerService.teacherService.uploadTeacherService;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;
@WebServlet( "/uploadTeacher")
public class uploadTeacher extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {
        request.setCharacterEncoding("utf8");
         response.setContentType("text/html;character=utf8");
         response.setCharacterEncoding("UTF-8");
         try{
            Random random = new Random();
            Integer teacherID =random.nextInt(100);
       if(request.getParameter("teacherID") != null && !"".equals(request.getParameter("teacherID"))) {
           teacherID =  Integer.valueOf(request.getParameter("teacherID"));
       }
            String teacherName = request.getParameter("teacherName");
       Integer teacherAge =random.nextInt(100);
       if(request.getParameter("teacherAge") != null && !"".equals(request.getParameter("teacherAge"))) {
           teacherAge =  Integer.valueOf(request.getParameter("teacherAge"));
       }
           String teacherSex =    request.getParameter("teacherSex");
           String teacherOBTime = request.getParameter("teacherOBTime");
           String teacherTitle =  request.getParameter("teacherTitle");
           String teacherDept =   request.getParameter("teacherDept");
           boolean flag = uploadTeacherService.processUpload(teacherID, teacherName, teacherAge, teacherSex, teacherOBTime, teacherTitle, teacherDept);
           if (flag) {
               //上传成功
               response.sendRedirect("demo/index/adminis_pages/teacherUploadSuccess.html");
           } else {
               //上传失败
               response.sendRedirect("demo/index/adminis_pages/teacherUploadFail.html");
           }
        } catch(Exception e){
             response.sendRedirect("demo/index/adminis_pages/teacherUploadFail.html");
     }
   }
}

