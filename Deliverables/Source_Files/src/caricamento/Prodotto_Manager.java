package caricamento;

import java.sql.ResultSet;
import java.sql.SQLException;


import Bean.Utente;
import Bean.Foto;

import Bean.Prodotto;
import DBMS.ConnessioneDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * Classe Prodotto_Manager per l'inserimento del prodotto nella base di dati
 */
public class Prodotto_Manager {
    
    /**
     * Metodo per inserire il prodotto nella base di dati se esso e' presente 
     * aggiorna solo la quantita'
     * @param prod
     * @param foto
     * @return 2/1, si comporta come true o false
     * pre: prod diverso da null  e foto diverso da null
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public int SalvaProdotto(Prodotto prod,Foto foto) throws ClassNotFoundException, SQLException
    {
        
        //query per aggiornare il prodotto o inserirne uno nuovo
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        PreparedStatement ps=null;
        
        String query = "SELECT cod_pezzo FROM Prodotto WHERE cod_pezzo=?";
        ps=(PreparedStatement) conn.prepareStatement(query);
        ps.setString(1, prod.getCod_pezzo());
        ResultSet rs=ps.executeQuery();
        //verifico se il prodotto � presente, se si allora lo aggiorno
        if(rs.next())   /*Controllo se il prodotto � stato gi� inserito,aggiorno la quantit�*/
        {
            String aggiorna_quanti="update Prodotto set quantita = ? where cod_pezzo = ?";
            ps=(PreparedStatement) conn.prepareStatement(aggiorna_quanti);
            ps.setInt(1, prod.getQuantita());
            ps.setString(2,prod.getCod_pezzo());
            ps.executeUpdate();
            return(1);
        }
        //altrimenti inserisco un nuovo prodotto
        else  /*Prodotto nuovo e lo inserisco*/
        {
            String inserisciprod = " INSERT INTO  Prodotto  VALUES(?,?,?,?,?,?,?,?)";
            
            ps=(PreparedStatement) conn.prepareStatement(inserisciprod);
            ps.setString(1,prod.getCod_pezzo());
            ps.setString(2, prod.getMarchio());
            ps.setString(3, prod.getModello());
            ps.setFloat(4, prod.getPrezzo());
            ps.setBoolean(5, prod.isOfferta());
            ps.setFloat(6,  prod.getPrezzo_scontato());
            ps.setString(7, prod.getDescrizione());
            ps.setInt(8, prod.getQuantita());
            ps.executeUpdate();
            
            String insfotprod =" INSERT INTO  Foto (path,prodotto) VALUES(?,?)";
            ps=(PreparedStatement) conn.prepareStatement(insfotprod);
            ps.setString(1,"img_non_disp.gif");
            ps.setString(2,prod.getCod_pezzo());
            ps.executeUpdate();
            return(2);
        }
        
        
        
    }
    
}
