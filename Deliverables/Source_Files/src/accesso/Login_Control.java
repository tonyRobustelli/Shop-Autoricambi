package accesso;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.Utente;


public class Login_Control extends HttpServlet{
    
  
    public Login_Control()
    {
        super();
    }
    
   
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        
        //prevela e verifica i dati del form di accesso
        String e_mail = request.getParameter("log");
        String pass = request.getParameter("pwd");
        PrintWriter out = response.getWriter();
        Utente utente=new Utente();
        Login_Manager model=new Login_Manager();
        try {
            utente=model.ControllaLogin(e_mail, pass);
            System.out.println("Sono quiiii");
            if(utente==null)
            {
                System.out.println("Sono quiiiisasas");
                out.println("<script>");
                out.println("alert('Login errato,registrati al nostro sito');");
                out.println("location='registrazione.jsp';");
                out.println("</script>");
            }
            else
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("Utente", utente);
                Utente cliente=(Utente) session.getAttribute("Utente");
                System.out.println("Sono oggetto sessione  "+cliente.isAmministratore());
                out.println("<script>");
                out.println("alert('Accesso effettuato');");
                out.println("location='index.jsp';");
                out.println("</script>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
   
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        doGet(request,response);
    }
    
}
