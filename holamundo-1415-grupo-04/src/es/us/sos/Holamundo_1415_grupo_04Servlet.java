package es.us.sos;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Holamundo_1415_grupo_04Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain"); 
		String saludo = req.getPathInfo();
		if(saludo.toLowerCase().contains("manu")
				||saludo.toLowerCase().contains("mariajose")
				||saludo.toLowerCase().contains("augusto")){
		
			resp.getWriter().println("Hola "+saludo.substring(1, saludo.length())+"!");
		
		}
		else{
			resp.getWriter().println("<html><body><h1>Error 404</h1></body></html>");
		}
		}
}
