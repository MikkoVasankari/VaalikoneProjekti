package app;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Daor;
import dao.ehdokasVastauksetDAO;
import dao.kyselydao;
import data.kysymys;
import data.Ehdokas;
import data.Tulos;
import data.ehdokasVastaukset;

@WebServlet(name = "showTulokset", urlPatterns = { "/showTulokset" })
public class showTulokset extends HttpServlet {
	private kyselydao dao1 = null;
	private ehdokasVastauksetDAO dao2 = null;
	private Daor dao3 = null;

	@Override
	public void init() {
		dao1 = new kyselydao("jdbc:mysql://localhost:3306/vaalikone", "root", "root");
		dao2 = new ehdokasVastauksetDAO("jdbc:mysql://localhost:3306/vaalikone", "root", "root");
		dao3 = new Daor("jdbc:mysql://localhost:3306/vaalikone", "root", "root");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");

//		Luotu lista vastauksille, kysymyksille,ehdokkaille, 
//		ehdokkaidenVastauksille ja ehdokasJaSamatVastaukset

		ArrayList<Ehdokas> ehdokasLista = new ArrayList<Ehdokas>();
		ArrayList<Tulos> vastauslista = new ArrayList<Tulos>();
		ArrayList<kysymys> kysymyslista = null;
		ArrayList<ehdokasVastaukset> ehdokasVastauksetLista = null;
		ArrayList<Tulos> ehdokasJaSamatVastaukset = new ArrayList<Tulos>();
		ArrayList<Ehdokas> parhaatEhdokkaat = new ArrayList<Ehdokas>();

//		Haetaan tietokannasta kysymykset 
		if (dao1.getConnection()) {
			kysymyslista = dao1.readAllKysymykset();
		} else {
			System.out.println("No connection to database");
		}

		if (dao2.getConnection()) {
			ehdokasVastauksetLista = dao2.readAllVastaukset();
		} else {
			System.out.println("No connection to database");
		}
		if (dao3.getConnection()) {
			ehdokasLista = dao3.readAllEhdokkaat();
		} else {
			System.out.println("No connection to database");
		}

//		Loopataan kysymyslista ja lis�t��n vastauksen kysymyksen mukaan vastauslistaan
		for (int i = 1; kysymyslista != null && i < kysymyslista.size() + 1; i++) {

			String tulos = request.getParameter("q" + i);
			Tulos t = new Tulos(i, tulos);
			vastauslista.add(t);

		}

//		Loopataan kysymyslista ja vertaillaan jokaisen ehdokkaan kohdalla annettuja vastauksia
//		List��n samat vastaukset listaan
		for (int j = 0; ehdokasLista != null && j < ehdokasLista.size(); j++) {
			for (int i = 0; kysymyslista != null && i < kysymyslista.size(); i++) {
				
				Ehdokas ehdokas = ehdokasLista.get(j);
				ehdokasVastaukset ehdokasVastaus = ehdokasVastauksetLista.get(i);
				Tulos vastausLista = vastauslista.get(i);
				
				int ehdokasNum = ehdokas.getId();
				String ehdokkaanVastaus = ehdokasVastaus.getVastaus();
				String AnnettuVastaus = vastausLista.getVastaus();

				if (ehdokkaanVastaus.equals(AnnettuVastaus)) {
					Tulos yhtVastaus = new Tulos(i,ehdokasNum, ehdokkaanVastaus);
					ehdokasJaSamatVastaukset.add(yhtVastaus);
				}

			}
		}
		
		
		
		for (int j = 0; ehdokasLista != null && j < ehdokasLista.size(); j++) {
			
			
		}
//		System.out.println(ehdokasJaSamatVastaukset);

//		L�hetet��n vastauslista eteenp�in showTulokset.jsp sivulle		
		
		
		if (request.getParameter("kysymyksetSubmit") != null) {
			request.setAttribute("vastaukset", ehdokasJaSamatVastaukset);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/showTulokset.jsp");
			rd.forward(request, response);
		}

	}

}
