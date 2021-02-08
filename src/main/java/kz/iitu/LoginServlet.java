package kz.iitu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

        if (login.equals("admin@mail.ru") && password.equals("admin")){
            out.println("Welcome, " + login);
            out.println("Your password: " + password);
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
        }else{
            out.println("Incorrect! Try again...");
            request.getRequestDispatcher("/main.jsp").forward(request, response);
        }
        out.close();
    }
}
