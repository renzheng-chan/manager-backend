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

@WebServlet("/showAppInfo")
public class ShowAppInfo extends HttpServlet {
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession =  req.getSession(false);
        if(httpSession == null){
            resp.sendRedirect("index.html");
            return;
        }
        try {
            req.setCharacterEncoding("utf8");
            String ID = req.getParameter("approvalID");
            Integer applicationID = Integer.valueOf(ID);
            List<Application> applications = loadApplicationService(applicationID);
            resp.setContentType("application/json;charset=utf-8");
            String respString = objectMapper.writeValueAsString(applications);
            resp.getWriter().write(respString);
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
