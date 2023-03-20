package com.scu.Controller.ManagerController.CRZController;

import com.scu.Service.ManagerService.CRZService.uploadStuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/uploadStu")
public class uploadStu extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession =  req.getSession(false);
        if(httpSession == null){
            resp.sendRedirect("index.html");
            return;
        }
        try {
            req.setCharacterEncoding("utf-8");
            String stuName = req.getParameter("stuName");
            Integer classID = Integer.valueOf(req.getParameter("stuClass"));
            Integer stuAge = Integer.valueOf(req.getParameter("stuAge"));
            Integer stuGrade = Integer.valueOf(req.getParameter("stuGrade"));
            String stuDept = req.getParameter("stuDept");
            String stuSex = req.getParameter("stuSex");
            String stuADTime = req.getParameter("stuADTime");
            if(uploadStuService.processUpload(stuName,stuAge,stuSex,classID,stuDept,stuGrade,stuADTime)){
                //上传成功
                resp.sendRedirect("demo/index/adminis_pages/stuClassUploadSuccess.html");
            }else{
                //上传失败
                resp.sendRedirect("demo/index/adminis_pages/stuClassUploadFail.html");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("demo/index/adminis_pages/stuClassUploadFail.html");
        }
    }
}
