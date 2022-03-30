package app;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import dao.Dao;
import dao.Daor;
import data.Ehdokas;


/**
 * Servlet implementation class ShowFish
 */
@WebServlet("/sEhdokkaat")
public class showehdokkaat extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Daor daor=null;
	
	// yritet��n saada toimimaan k�ytt�m�ll� opettajan antamaa fish tiedostoa
	@Override
	public void init() {
		daor=new Daor("jdbc:mysql://localhost:3306/vaalikone", "root", "root");
	}


public showehdokkaat() {
    super();
    // TODO Auto-generated constructor stub
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ArrayList<Ehdokas> list=null;
	if (daor.getConnection()) {
		// JATKA T�ST� JOS EES HUOMAAT T�N LOL
		list=daor.readAllEhdokkaat(); // Lassi: t�ss� ongelmia en tied� miten p��st� eteemp�in
	}
	else {
		System.out.println("No connection to database");
	}
	request.setAttribute("ehdokkaat", list);
	
	RequestDispatcher rd=request.getRequestDispatcher("/jsp/showehdokas.jsp"); // lukee jsp tiedoston kansiosta
	rd.forward(request, response);
}
}






