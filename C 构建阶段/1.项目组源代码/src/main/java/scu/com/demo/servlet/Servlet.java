package scu.com.demo.servlet;

import scu.com.demo.entity.User;
import scu.com.demo.service.UserService;
import scu.com.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet.do")
public class Servlet extends HttpServlet {
    //获取服务层的对象,用户服务对象
    UserService userService = new UserServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户的操作
        System.out.println("testpost");
        //解决中文乱码
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String opt = request.getParameter("opt");
        //后端模拟逻辑，操作数据库

        if(opt == null || "".equals(opt)){
            return;
        }else{
            if (opt.equals("login")){
                login(request,response);
            }else if (opt.equals("getUserInfo")){
                getUserInfo(request,response);
            }else if (opt.equals("logout")){
                logout(request, response);
            }else if(opt.equals("register")) {
                register(request,response);
            }
        }
    }

    private void getUserInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        PrintWriter writer = response.getWriter();
        if(user == null)
            writer.write(
                    "{\"message\":\"用户获取失败\""
            );
        else if(user.getRole() == null)
            writer.write(
                    "{\"message\":\"用户身份错误（为空）\""
            );
        else {
            writer.write(
                    "{\"message\":\"获取成功\""+
                            ",\"account\":"+user.getAccount()+
                            ",\"password\":\""+user.getPassword()+"\""+
                            ",\"role\":\""+user.getRole()+"\"}"
            );
        }
        writer.flush();
        writer.close();
    }

    private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取表单参数
        String userAccount = request.getParameter("account");
        String userPassword = request.getParameter("password");
        String userRole = request.getParameter("role");
        //2.封装参数
        User user = new User();
        user.setAccount(Integer.parseInt(userAccount));
        //检测是否已经注册
        PrintWriter writer = response.getWriter();

        User login = userService.getUserById(user);
        if(login != null){
            response.sendRedirect("../demo/login/login.html?message=user already exists!");
            return ;
        }
        user.setPassword(userPassword);
        user.setRole(userRole);
        //3.新增
        try {
            int i = userService.addUser(user);
            if(i == 0){
                //新增失败
                request.setAttribute("message", "注册失败！");

            }else{
                //新增成功
                request.setAttribute("message", "注册成功！");
                HttpSession session = request.getSession();
                //将用户数据存放到session里面
                session.setAttribute("user", user);
                if(userRole.equals("student"))
                    response.sendRedirect("demo/index/student_index.html");
                else if(userRole.equals("teacher"))
                    response.sendRedirect("demo/index/index.html");
                else if(userRole.equals("manager"))
                    response.sendRedirect("demo/index/adminis_pages/Manager.html");
                else
                    response.sendRedirect("../demo/index/index.html");
            }
            writer.flush();
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
            response.sendRedirect("../demo/index/index.html");
        }
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        System.out.println("用户已成功退出登录！");
        response.sendRedirect("../demo/login/login.html?message=logout successfully!");
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取用户名密码
        String userAccount = request.getParameter("account");
        String userPassword = request.getParameter("password");
        String userRole = request.getParameter("role");
        //2.封装查询参数
        User user = new User();
        user.setAccount(Integer.parseInt(userAccount));
        user.setPassword(userPassword);
        user.setRole(userRole);
        //3.调用服务层进行查询
        User login = userService.login(user);
//        PrintWriter writer = response.getWriter();

        //4.是否登陆成功
        if (login == null) {
            //登录失败
            System.out.println("登陆失败！");
            response.sendRedirect("../demo/login/login.html?message=username or password or role is wrong!");
        } else {
            System.out.println("登陆成功！");
            HttpSession session = request.getSession();
            //将用户数据存放到session里面
            session.setAttribute("user", login);
            //设置过期时间
            session.setMaxInactiveInterval(30 * 60);

            if(userRole.equals("student"))
                response.sendRedirect("../demo/index/student_index.html");
            else if(userRole.equals("teacher"))
                response.sendRedirect("../demo/index/index.html");
            else if(userRole.equals("manager"))
                response.sendRedirect("./demo/index/adminis_pages/Manager.html");
            else
                response.sendRedirect("../demo/login/login.html?message=username or password or role is wrong!");
        }
//        writer.flush();
//        writer.close();
    }
}
