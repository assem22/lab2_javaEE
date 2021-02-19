package kz.iitu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	Cookie[] cookies = request.getCookies();
    	if(cookies != null){
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("email")){
					System.out.println("JSESSIONID="+cookie.getValue());
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					break;
				}
			}
    	}
    	//invalidate the session if exists
    	HttpSession session = request.getSession(false);
    	System.out.println("User="+session.getAttribute("email"));
		session.invalidate();
		response.sendRedirect("logIn.jsp");
    }

}
