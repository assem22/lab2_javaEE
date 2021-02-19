package kz.iitu.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("email");
        String password = request.getParameter("password");

        if (login.equals("assem@mail.ru") && password.equals("admin")){
            HttpSession session = request.getSession();
            session.setAttribute("email", "Mukhamadi");
            Cookie userName = new Cookie("email", login);
            response.addCookie(userName);
            response.sendRedirect("welcomeBack.jsp");
//            out.println("<h1>Welcome, " + login + "</h1><br>");
//            out.println("<h2>Your password: " + password + "</h2><br>");
//            out.println("Go to <a href='main.jsp'>Main page</a>");
        }else{
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/logIn.jsp");
            out.println("<h2>Incorrect! Try again or register.</h2><br>");
            out.println("Incorrect! Try again or register.");
            rd.include(request, response);
//            request.getRequestDispatcher("/main.jsp").forward(request, response);
        }
        out.close();
    }
}
