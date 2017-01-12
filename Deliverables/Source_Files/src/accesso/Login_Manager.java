package accesso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import Bean.Utente;
import DBMS.ConnessioneDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Classe che gestisce la tansazione inerente al login
 */
public class Login_Manager {
    
    /**
     * Metodo che verifica la correttezza delle credenziali di login accesso
     * @param e_m email utilizzata per il login
     * @param pass password utilizzata per il login
     * @return restituisce l'oggetto cliente se le credenziali sono presenti nel database 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Utente ControllaLogin(String e_m,String pass) throws ClassNotFoundException, SQLException
    {
        
        //verifica se l'utente � presente nel DB
        
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        Utente cliente=new Utente();
        String query = "SELECT * FROM Utente WHERE email=? AND passw=?";
        PreparedStatement ps=null;
        ps=(PreparedStatement) conn.prepareStatement(query);
        ps.setString(1, e_m);
        ps.setString(2, pass);
        ResultSet rs=ps.executeQuery();
        if(!rs.next())
            return(null);  ///Utente non trovato
        else
        {
            rs=ps.executeQuery();
            while (rs.next()) {
                
                cliente.setCodiceFiscale(rs.getString("cf"));
                cliente.setCap(rs.getString("cap"));
                cliente.setVia(rs.getString("via"));
                cliente.setCitta(rs.getString("citta"));
                cliente.setNome(rs.getString("nome"));
                cliente.setDataNascita(rs.getString("data_nascita"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCellulare(rs.getString("cellulare"));
                cliente.setEmail(rs.getString("email"));
                cliente.setPassword(rs.getString("passw"));
               
                cliente.setAmministratore(rs.getBoolean("amministratore"));
               
                
            }
            System.out.println("vaivaivai"+cliente.getNome());
            return(cliente);
        }
        
        
    }
    
    
}