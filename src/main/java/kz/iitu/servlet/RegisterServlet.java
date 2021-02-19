package kz.iitu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String login = request.getParameter("email");
        String password = request.getParameter("password");
        String repeatPassword = request.getParameter("repeatPassword");

        if (password.equals(repeatPassword)){
            out.println("<h1>Successfully registered</h1><br>");
            out.println("<h2>Welcome, " + name + "</h2><br>");
            out.println("<h2>Your login: " + login + "</h2><br>");
            out.println("<h2>Your password: " + password + "</h2><br>");
            out.println("Go to <a href='main.jsp'>Main page</a>");
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
        }else{
            out.println("<h2>Passwords doesn't match! Try again...</h1><br>");
            out.println("Go to <a href='main.jsp'>Main page</a>");
        }
        out.close();

//        request.getRequestDispatcher("/main.jsp").forward(request, response);
    }
}
