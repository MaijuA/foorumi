import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "KirjauduUlosServlet", urlPatterns = {"/logout"})
public class KirjauduUlosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession istunto = request.getSession(false);
        if (istunto != null) {
            istunto.invalidate();
            response.sendRedirect("/kirjaudu");
        } else {
            response.sendRedirect("/index.html");
        }
    }
}
