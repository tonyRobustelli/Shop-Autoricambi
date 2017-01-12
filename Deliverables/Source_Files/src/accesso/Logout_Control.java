package accesso;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Bean.Utente;
import accesso.Login_Manager;

/**
 *  Classe che fornisce il servizio per effettuare il Logout
 */
public class Logout_Control extends HttpServlet
{

    /**
     * Costruttore vuoto
     */
    public Logout_Control() {
       super();
	 }
	
    /**
     * Effettua una richiesta HTTP GET per effettuare il logout
     * @param request
     * @param response
     * @throws IOException
     */
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		//non fa altro che invalidare la sessione
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		session.invalidate();
		response.sendRedirect("index.jsp");
	}
	
    /**
     * Effettua una richiesta HTTP POST per effettuare il logout
     * @param request
     * @param response
     * @throws IOException
     */
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	  doGet(request,response);
	}  
}