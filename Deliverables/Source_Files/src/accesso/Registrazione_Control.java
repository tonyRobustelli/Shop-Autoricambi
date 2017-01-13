package accesso;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Utente;

/**
 * Classe che fornisce il servizio per effettuare la registrazione
 */
public class Registrazione_Control extends HttpServlet {
    
    /**
     * Costruttore Vuoto
     */
    public Registrazione_Control()
    {
        super();
    }
    
    /**
     * Effettua una richiesta HTTP GET per effettuare la registrazione
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        //prelevo i dati dal form
        PrintWriter out = response.getWriter();
        Utente utente=new Utente();
        
        utente.setCodiceFiscale(request.getParameter("codicefiscale"));
        utente.setCap(request.getParameter("cap"));
        utente.setVia(request.getParameter("via"));
        utente.setDataNascita(request.getParameter("datanascita"));
        utente.setNome(request.getParameter("nome"));
        utente.setCognome(request.getParameter("cognome"));
        utente.setTelefono(request.getParameter("telefono"));
        utente.setCellulare(request.getParameter("cellulare"));
        utente.setPassword(request.getParameter("psw"));
        utente.setEmail(request.getParameter("email"));
        utente.setCap(request.getParameter("cap"));
        utente.setCitta(request.getParameter("citta"));
        utente.setVia(request.getParameter("via"));
        
        Registrazione_Manager model=new Registrazione_Manager();
        try {
            if(model.ControllaRegistrazioneUtente(utente.getCodiceFiscale()))///Se l'utente non � stato registrato,lo inserisco
            {
                System.out.println("Mi trovo quii");
                model.SalvaCliente(utente);
                out.println("<script>");
                out.println("alert('Registrazione eseguita correttamente');");
                out.println("location='index.jsp';");
                out.println("</script>");
            }
            else
            {
                System.out.println("Mi trovo quiiasas");
                out.println("<script>");
                out.println("alert('Sei gi� registrato al nostro sito');");
                out.println("location='index.jsp';");
                out.println("</script>");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
    
    /**
     * Effettua una richiesta HTTP POST per effettuare la registrazione
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        doGet(request,response);
    }
    
    
}
