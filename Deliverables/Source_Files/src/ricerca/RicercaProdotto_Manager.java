package ricerca;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




import Bean.Foto;


import Bean.Prodotto;
import Bean.ProdottoFoto;
import DBMS.ConnessioneDatabase;
import java.util.ArrayList;

public class RicercaProdotto_Manager {
    
    
    //lista dei prodotti

  
    public ArrayList<ProdottoFoto> lista_prodotti() throws ClassNotFoundException, SQLException{
        ArrayList<ProdottoFoto> array_prodotto=new ArrayList<>();
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        Statement st=conn.createStatement();
        
        String query="select * from prodotto,foto where prodotto.cod_pezzo=foto.prodotto group by cod_pezzo;";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            System.out.println("stismo nellaaaaa servlettttt");
            
            Prodotto prodotto=new   Prodotto();
            Foto foto=new Foto();
            ProdottoFoto foto_prodotti=new ProdottoFoto();
            
            
            prodotto.setCod_pezzo(rs.getString("cod_pezzo"));
            prodotto.setMarchio(rs.getString("marchio"));
            prodotto.setModello(rs.getString("modello"));
            prodotto.setPrezzo(rs.getFloat("prezzo"));
            prodotto.setOfferta(rs.getBoolean("offerta"));
            prodotto.setPrezzo_scontato(rs.getFloat("prezzo_scontato"));
            prodotto.setDescrizione(rs.getString("descrizione"));
            prodotto.setQuantita(rs.getInt("quantita"));
            
            foto.setProdotto(prodotto.getCod_pezzo());
            foto.setPath(rs.getString("path"));
            
            foto_prodotti.setFoto_bean(foto);
            foto_prodotti.setProdotto_bean(prodotto);
            array_prodotto.add(foto_prodotti);
            
        }
        rs.close();
        
        return array_prodotto;
    }
    
    //lista dei prodotti carcati grazie alla servlet di ricerca

  
    public ArrayList<ProdottoFoto> cerca_prodotti(Prodotto prodotto) throws ClassNotFoundException, SQLException{
        ArrayList<ProdottoFoto> array_prodotto=new ArrayList<>();
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        
        System.out.println("cod"+prodotto.getCod_pezzo()+" marchio"+prodotto.getMarchio()+" "+prodotto.getModello());
        String query="select * from prodotto,foto where prodotto.cod_pezzo=foto.prodotto and ( modello LIKE '%"+prodotto.getModello()+"%' and marchio LIKE '%"+prodotto.getMarchio()+"%'  and cod_pezzo LIKE '%"+prodotto.getCod_pezzo()+"%' ) group by cod_pezzo; ";
        PreparedStatement st=conn.prepareStatement(query);
        
        ResultSet rs = st.executeQuery(query);
        
        
        
        while(rs.next()){
            System.out.println("stismo nellaaaaa servlettttt");
            
            Prodotto prod=new Prodotto();
            Foto foto=new Foto();
            ProdottoFoto foto_prodotti=new ProdottoFoto();
            
            
            prod.setCod_pezzo(rs.getString("cod_pezzo"));
            prod.setMarchio(rs.getString("marchio"));
            prod.setModello(rs.getString("modello"));
            prod.setPrezzo(rs.getFloat("prezzo"));
            prod.setOfferta(rs.getBoolean("offerta"));
            prod.setPrezzo_scontato(rs.getFloat("prezzo_scontato"));
            prod.setDescrizione(rs.getString("descrizione"));
            prod.setQuantita(rs.getInt("quantita"));
            
            foto.setProdotto(prodotto.getCod_pezzo());
            foto.setPath(rs.getString("path"));
            
            
            //classe che unisce foto  e prodotti
            foto_prodotti.setFoto_bean(foto);
            foto_prodotti.setProdotto_bean(prod);
            System.out.println("asasasas as as as as a sprovaaaaaaaaaaaaaaaaaaa"+rs.getFloat("prezzo"));
            //array della classe che unisce foto e prodotti
            
            array_prodotto.add(foto_prodotti);
                     System.out.println("asasaasasasasas dopo nel manager "+array_prodotto.get(0).getProdotto_bean().getPrezzo());
					
        }
        rs.close();
        
        return array_prodotto;
    }
    
    //filtra il prodotto da far vedere nella scheda tecnica

  
    public Prodotto scheda_tecnica_prodotto(String cod_pezzo) throws ClassNotFoundException, SQLException{
        
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        Statement st=conn.createStatement();
        String query="select * from prodotto where  prodotto.cod_pezzo='"+cod_pezzo+"'; ";
        
        
        ResultSet rs = st.executeQuery(query);
        
        
        Prodotto prodotto=new   Prodotto();
        while(rs.next()){
            
            
            prodotto.setCod_pezzo(rs.getString("cod_pezzo"));
            prodotto.setMarchio(rs.getString("marchio"));
            prodotto.setModello(rs.getString("modello"));
            prodotto.setPrezzo(rs.getFloat("prezzo"));
            prodotto.setOfferta(rs.getBoolean("offerta"));
            prodotto.setPrezzo_scontato(rs.getFloat("prezzo_scontato"));
            prodotto.setDescrizione(rs.getString("descrizione"));
            prodotto.setQuantita(rs.getInt("quantita"));
        }
        
        rs.close();
        
        
        
        return prodotto;
    }
    
    
    //filtra le foto del prodotto

    
    public ArrayList<Foto> scheda_tecnica_foto(String cod_pezzo) throws ClassNotFoundException, SQLException{
        
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        Statement st=conn.createStatement();
        String query="select * from prodotto,foto where prodotto.cod_pezzo=foto.prodotto and prodotto.cod_pezzo='"+cod_pezzo+"'; ";
        
        
        
        ResultSet rs = st.executeQuery(query);
        
        
        
        ArrayList<Foto> foto_array=new ArrayList<>();
        while(rs.next()){
            
            
            
            
            Foto foto_bean=new Foto();
            
            
            foto_bean.setProdotto(rs.getString("prodotto"));
            foto_bean.setPath(rs.getString("path"));
            
            
            
            
            //array della classe che unisce foto e prodotti
            foto_array.add(foto_bean);
            
        }
        rs.close();
        
        return foto_array;
    }
    
   
    
    
}