package kz.iitu.filter;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.logging.Logger;

public class LoggingRequestFilter implements Filter {
    private ServletContext context;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.context = filterConfig.getServletContext();
        this.context.log("Logging Request Filter");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        Cookie[] cookies = request.getCookies();
        Enumeration<String> params = request.getParameterNames();

        while(params.hasMoreElements()){
            String name = params.nextElement();
            String value = request.getParameter(name);
            this.context.log(request.getRemoteAddr() + " parameters: "+name+"="+value);
            System.out.println(request.getRemoteAddr() + " parameters: "+name+"="+value);
        }

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println("Cookie name: " + cookie.getName());
                System.out.println("Cookie value: " + cookie.getValue());
                this.context.log(request.getRemoteAddr());
                this.context.log("Cookie name: " + cookie.getName());
                this.context.log("Cookie value: " + cookie.getValue());
//                System.out.println(req.getParameter("email"));
//                System.out.println(req.getParameter("password"));
            }
        }
        filterChain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }
}
