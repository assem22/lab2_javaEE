package kz.iitu.filter;

import kz.iitu.fakeDB.FakeDB;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

import static java.util.Objects.nonNull;

public class RequestFilter implements Filter {
    private ServletContext context;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
        this.context.log("Request Session validation Filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest req = (HttpServletRequest) servletRequest;
        final HttpServletResponse res = (HttpServletResponse) servletResponse;

        final String login = req.getParameter("email");
        final String password = req.getParameter("password");

        String uri = req.getRequestURI();
        this.context.log("Requested Resource::"+uri);

        HttpSession session = req.getSession(false);

        if(session == null && !(uri.endsWith("jsp") || uri.endsWith("LoginServlet") || uri.endsWith("RegisterServlet"))){
            this.context.log("Unauthorized access request");
            res.sendRedirect("logIn.jsp");
        }else{
            // pass the request along the filter chain
            filterChain.doFilter(servletRequest, servletResponse);
        }

//        String loginURL = req.getContextPath() + "/logIn";
//        String registerURL = req.getContextPath() + "/registration";
//
//        boolean loggedIn = session != null && session.getAttribute("email") != null;
//        boolean loginRequest = req.getRequestURI().equals(loginURL) || req.getRequestURI().equals(loginURL + ".jsp");
//        boolean registerRequest = req.getRequestURI().equals(registerURL) || req.getRequestURI().equals(registerURL + ".jsp");
//
//        if(loggedIn || loginRequest || registerRequest) {
//            filterChain.doFilter(servletRequest, servletResponse);
//        }
//        else {
//            res.sendRedirect("logIn.jsp");
//        }
    }

    @Override
    public void destroy() {

    }
}
