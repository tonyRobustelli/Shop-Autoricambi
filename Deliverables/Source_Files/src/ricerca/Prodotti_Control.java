package ricerca;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Bean.Prodotto;
import Bean.ProdottoFoto;   
import DBMS.ConnessioneDatabase;

/**
 * Servlet implementation class Prodotti_Control
 */
public class Prodotti_Control extends HttpServlet {

    /**
     * Empty
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	}
	
    /**
     * Serve una richiesta http post, per gestire la ricerca dei prodotti, esso richiama
     * RicercaProdotto_Manager
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String azione=request.getParameter("azione");
		RicercaProdotto_Manager query_prodotti=new RicercaProdotto_Manager();

		
		
		Prodotto prodotto_bean=new Prodotto();
		
		// per il form di ricerca
		if(azione.equals("cerca")){
			System.out.println("sto nel cerca");
			prodotto_bean.setCod_pezzo(request.getParameter("cod_pezzo"));
			prodotto_bean.setMarchio(request.getParameter("marchio"));
			prodotto_bean.setModello(request.getParameter("modello"));
			System.out.println("cod"+prodotto_bean.getCod_pezzo()+" marchio"+prodotto_bean.getMarchio()+" "+prodotto_bean.getModello());
			
			
			if(prodotto_bean.getCod_pezzo()==null || prodotto_bean.getCod_pezzo()=="" )prodotto_bean.setCod_pezzo("_");
			if(prodotto_bean.getMarchio()==null || prodotto_bean.getMarchio()=="")prodotto_bean.setMarchio("_");
			if(prodotto_bean.getModello()==null || prodotto_bean.getModello()=="")prodotto_bean.setModello("_");
			ArrayList<ProdottoFoto> array_prodotto=new ArrayList<>();
			
					 try {
						array_prodotto=query_prodotti.cerca_prodotti(prodotto_bean);
                                                System.out.println("asasaasasasasas dopo nel control "+array_prodotto.get(0).getProdotto_bean().getPrezzo());
					} catch (ClassNotFoundException | SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
				RequestDispatcher dispatcher;
				dispatcher = getServletContext().getRequestDispatcher("/cerca_prodotti.jsp");
				request.setAttribute("array_prodotto", array_prodotto);
				dispatcher.forward(request,response);
		}
		else if(azione=="inserisci"){
			//non usato piu
			
			
		}
	}

}
