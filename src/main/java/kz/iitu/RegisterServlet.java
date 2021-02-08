package kz.iitu;

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

        String login = request.getParameter("email");
        String password = request.getParameter("password");
        String repeatPassword = request.getParameter("repeatPassword");

        out.println("Successfully registered");
        out.println("Welcome, " + login);
        out.println("Your password: " + password);

        if (password.equals(repeatPassword)){
            out.println("Successfully registered");
            out.println("Welcome, " + login);
            out.println("Your password: " + password);
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("main.jsp");
        }else{
            out.println("Passwords doesn't match! Try again...");
        }
        out.close();

        request.getRequestDispatcher("/main.jsp").forward(request, response);
    }
}
