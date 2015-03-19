package es.us.sos;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PruebaServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<html><body><h1>HOLA MUNDO! (por Get)</h1></body></html>");
	}
}
