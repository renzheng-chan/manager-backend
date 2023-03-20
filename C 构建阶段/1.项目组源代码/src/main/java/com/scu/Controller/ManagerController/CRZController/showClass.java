package com.scu.Controller.ManagerController.CRZController;

import com.scu.Entity.ManagerEntity.CRZEntity.ClassInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

import static com.scu.Service.ManagerService.CRZService.ShowClassService.showClassService;

@WebServlet("/showClass")
public class showClass extends HttpServlet {
    private final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession =  req.getSession(false);
        if(httpSession == null){
            resp.sendRedirect("index.html");
            return;
        }
        List<ClassInfo> Classes= showClassService();
        resp.setContentType("application/json;charset=utf-8");
        String respString = objectMapper.writeValueAsString(Classes);
        resp.getWriter().write(respString);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession httpSession =  req.getSession(false);
//        if(httpSession == null){
//            resp.sendRedirect("demo/index/adminis_pages/index.html");
//            return;
//        }
         this.doGet(req, resp);
    }
}
