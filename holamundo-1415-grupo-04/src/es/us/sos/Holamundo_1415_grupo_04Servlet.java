package es.us.sos;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Holamundo_1415_grupo_04Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
