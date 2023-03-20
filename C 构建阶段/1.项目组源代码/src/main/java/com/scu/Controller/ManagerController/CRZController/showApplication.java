package com.scu.Controller.ManagerController.CRZController;
import com.scu.Entity.ManagerEntity.CRZEntity.Application;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import static com.scu.Service.ManagerService.CRZService.showApplicationService.loadApplicationService;
import static com.scu.Service.ManagerService.CRZService.updateApplicationService.approvalService;

@WebServlet("/showApplication")
public class showApplication extends HttpServlet {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession =  req.getSession(false);
        if(httpSession == null){
            resp.sendRedirect("index.html");
            return;
        }
        System.out.println("开始获取application");
        req.setCharacterEncoding("utf8");
        List<Application> applications = loadApplicationService();
        resp.setContentType("application/json;charset=utf-8");
        String respString = objectMapper.writeValueAsString(applications);
        resp.getWriter().write(respString);
        resp.getWriter().flush();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession =  req.getSession(false);
        if(httpSession == null){
            resp.sendRedirect("index.html");
            return;
        }
        req.setCharacterEncoding("utf8");
        try {

            String approvalResult = req.getParameter("approvalResults");
            String approver = req.getParameter("approver");
            String approvalTime = req.getParameter("approvalTime");
            System.out.println(req.getParameter("applicationID"));
//            Integer applicationID = Integer.valueOf(req.getParameter("approvalID"));

            //暂时修改
            Application application = new Application(1,approvalResult,approvalTime,approver);
            if(approvalService(application)){
                resp.sendRedirect("demo/index/adminis_pages/courseUploadSuccess.html");
            }else{
                resp.sendRedirect("demo/index/adminis_pages/applicationFail.html");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("demo/index/adminis_pages/applicationFail.html");
        }
    }
}
