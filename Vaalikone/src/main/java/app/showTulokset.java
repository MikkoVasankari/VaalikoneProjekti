package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "showTulokset", 
urlPatterns = { "/showTulokset" })
public class showTulokset extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Cookie[] keksit = request.getCookies();
		
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

		response.getWriter().print("Tulokset");

		PrintWriter writer = response.getWriter();
		for (int i = 0; i < keksit.length; i++) {
			String name = keksit[i].getName();
			String value = keksit[i].getValue();
			writer.println("Name= " + name + " Value= " + value);
		}
		writer.close();
		
	}

}
