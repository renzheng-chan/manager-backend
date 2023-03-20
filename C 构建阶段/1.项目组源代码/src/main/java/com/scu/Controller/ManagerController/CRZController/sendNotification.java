package com.scu.Controller.ManagerController.CRZController;
import com.scu.Entity.ManagerEntity.CRZEntity.Notification;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import static com.scu.Service.ManagerService.CRZService.sendNoteService.processNote;
@WebServlet("/sendNotification")
public class sendNotification extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession =  req.getSession(false);
        if(httpSession == null){
            resp.sendRedirect("index.html");
            return;
        }
        req.setCharacterEncoding("utf-8");
        try{
            String noticeTitle = req.getParameter("noticeTitle");
            String noticeInfo = req.getParameter("noticeInfo");
            String noticeTime = req.getParameter("noticeTime");
            String notifier = req.getParameter("notifier");
            Notification notification = new Notification(noticeTitle,noticeInfo,noticeTime,notifier);
            //将通知存入数据库中
            if(processNote(notification)){
                //发送成功后重定向到发送成功页面
                resp.sendRedirect("demo/index/adminis_pages/noticeUploadSuccess.html");
            }else{
                resp.sendRedirect("demo/index/adminis_pages/noticeUploadFail.html");
            }

        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("demo/index/adminis_pages/noticeUploadFail.html");
        }
    }
}
