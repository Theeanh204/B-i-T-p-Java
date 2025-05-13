import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputString = request.getParameter("inputString");
        int count = (inputString != null) ? inputString.length() : 0;

        request.getSession().setAttribute("inputString", inputString);
        request.getSession().setAttribute("count", count);

        request.getRequestDispatcher("count.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp"); // Điều hướng nếu người dùng truy cập trực tiếp
    }
}