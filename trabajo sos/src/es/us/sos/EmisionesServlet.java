package es.us.sos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class EmisionesServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		process(req, resp);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String resource = req.getPathInfo();
		if (resource!=null){
			process(req, resp);
		}
	}
	
	public void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String resource = req.getPathInfo();
		if (resource==null){
			process(req, resp);
		}
	}
	
	public void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		process(req, resp);
	}
	
	public void process(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		PrintWriter out = resp.getWriter();
		String resource = req.getPathInfo(); 
		String method = req.getMethod();
		if(method == "PUT"){
			out.println("No es posible realizar el comando PUT");
		}else{
			out.println("Has introducido el dato: "+ resource + " via "+method);
		}
		out.close();
		
	}
	
}