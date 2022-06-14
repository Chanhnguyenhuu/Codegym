package codegym.module3.thuc_hanh_2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "LoginServlet", value = "/login")
public class HelloServlet extends HttpServlet {
    /*private String message;

    public void init() {
        message = "Hello World!";
    }*/

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if ("admin".equals(username) && "admin".equals(password)) {
            writer.println("<h1>Welcome " + username + " to website</h1>");
        } else {
            writer.println("<h1>Login Error</h1>");
        }

        writer.println("</html>");
    }

    public void destroy() {
    }
}