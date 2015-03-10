package es.us.sos;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class AugustoServlet1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("<html><body><h1>HOLA Maria Jose!!!! =)</h1></body></html>");
	}
}
