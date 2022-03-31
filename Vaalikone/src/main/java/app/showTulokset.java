package app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.kyselydao;
import data.kysymys;
import data.Tulos;

@WebServlet(name = "showTulokset", urlPatterns = { "/showTulokset" })
public class showTulokset extends HttpServlet {
	private kyselydao dao = null;
	
	@Override
	public void init() {
		dao = new kyselydao("jdbc:mysql://localhost:3306/vaalikone", "root", "root");
	}

	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

//		Luotu lista vastauksille ja kysymyksille
		ArrayList<Tulos> vastauslista = new ArrayList<Tulos>();
		ArrayList<kysymys> kysymyslista = null;
		
//		Haetaan tietokannasta kysymykset 
		if (dao.getConnection()) {
			kysymyslista = dao.readAllKysymykset();
		} else {
			System.out.println("No connection to database");
		}
		
//		Loopataan kysymyslista ja lis‰t‰‰n vastauksen kysymyksen mukaan vastauslistaan
		for (int i = 1; kysymyslista != null && i < kysymyslista.size()+1; i++){	
			
			String tulos = request.getParameter("q"+i);
			Tulos t = new Tulos(i,tulos);
			vastauslista.add(t);
			
		}
		
//		L‰hetet‰‰n vastauslista eteenp‰in showTulokset.jsp sivulle		
		if(request.getParameter("kysymyksetSubmit") != null) {
			request.setAttribute("vastaukset",vastauslista);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/showTulokset.jsp");
			rd.forward(request, response);
		}	
		
	}

}
