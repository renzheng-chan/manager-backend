package scu.com.demo.filter;

import scu.com.demo.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


//@WebServlet("/*")
public class FilterAccess implements Filter {



    public void init(FilterConfig filterConfig) throws ServletException {}



    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        // 获得在下面代码中要用的request,response,session对象
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        HttpServletResponse servletResponse = (HttpServletResponse) response;
        HttpSession session = servletRequest.getSession();

        // 获得用户请求的URI
        String path = servletRequest.getRequestURI();
        System.out.println("path:"+path);
        //System.out.println(path);

        // 从session里获取登录信息
        User user = (User) session.getAttribute("user");
        String opt = request.getParameter("opt");
        if (user == null) {//未登录
            if((!("login").equals(opt))&&(!("register").equals(opt)))
            // 并且不是登录请求，跳转到登陆页面
                servletResponse.sendRedirect("../login/login.html");
            else chain.doFilter(request,response);//登录请求则继续该请求
        } else {
            // 已经登陆,继续此次请求
            System.out.println(user);
            chain.doFilter(request, response);
        }
    }



    public void destroy() {}

}
