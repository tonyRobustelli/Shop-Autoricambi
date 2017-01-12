package accesso;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;



import Bean.Utente;
import DBMS.ConnessioneDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Registrazione_Manager  {
    

    public void SalvaCliente(Utente utente) throws ClassNotFoundException, SQLException
    {
        System.out.println("giovanotto le si sta registrando");
        //inserisco un altro utente
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        PreparedStatement ps=null;
        
        /*SOTTO COMMENTI NEL CASO INSERIRE CONTROLLI DEL CODICE IMPROVVISI
        
        
        String query = "SELECT * FROM Indirizzo_Cliente WHERE cap=? AND via=?";
        ps=(PreparedStatement) conn.prepareStatement(query);
        ps.setString(1, utente.getCap());
        ps.setString(2, utente.getVia());
        ResultSet rs=ps.executeQuery();*/
        
        /*if(!rs.next())   /*Controllo se ci sono occorrenze gi� di cap e via*/
        /* {
        String inserisci_indi_clie=" INSERT INTO  indirizzo_cliente (VIA,CAP,CITTA)  VALUES(?,?,?)";
        /*Inserisco i valori nella tabella indirizzo_cliente*/
        /*  ps=(PreparedStatement) conn.prepareStatement(inserisci_indi_clie);
        
        ps.executeUpdate();
        } */
        
        
        /*Inserisco i valori nella tabella cliente*/
        String inserisci_utente = " INSERT INTO  Utente (cf,CAP,VIA,NOME,COGNOME,DATA_NASCITA,TELEFONO,CELLULARE,EMAIL,PASSW,CITTA) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        ps=(PreparedStatement) conn.prepareStatement(inserisci_utente);
        ps.setString(1,utente.getCodiceFiscale());
        ps.setString(2, utente.getCap());
        ps.setString(3, utente.getVia());
        
        ps.setString(4, utente.getNome());
        ps.setString(5, utente.getCognome());
        ps.setString(6,  utente.getDataNascita());
        ps.setString(7, utente.getTelefono());
        ps.setString(8, utente.getCellulare());
        ps.setString(9, utente.getEmail());
        ps.setString(10, utente.getPassword());
        
        ps.setString(11, utente.getCitta());
        ps.executeUpdate();
        
        
    }
    
    
    
    public boolean ControllaRegistrazioneUtente(String codice_fiscale) throws ClassNotFoundException, SQLException
    {
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        PreparedStatement ps=null;
        String query = "SELECT cf FROM Utente WHERE cf=?";
        ps=(PreparedStatement) conn.prepareStatement(query);
        ps.setString(1, codice_fiscale);
        ResultSet rs=ps.executeQuery();
        if(!rs.next())
            return(true);
        else
            return(false);
    }
}
