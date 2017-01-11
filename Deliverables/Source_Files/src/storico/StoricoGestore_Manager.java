package storico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Bean.Foto;
import Bean.Prodotto;
import Bean.ProdottoFoto;
import DBMS.ConnessioneDatabase;
import java.sql.Connection;

/**
 * Classe che si occupa di gestire la transazione inerente allo storico del cliente
 */
public class StoricoCliente_Manager {
    
    
    private ArrayList<AmministratoreUtente> lista_ogg_amministratore_cli;

    /**
     * Costruttore Vuoto
     */
    public StoricoCliente_Manager(){
        
        
        lista_ogg_amministratore_cli=new ArrayList<>();
    }
    //uso gli oggetti OggettoAreaAmminisratoreCli perche per ogni fattura ho un array list
    //di prodotti , ecco quindi l'uso dell' OggettoAmministratore, non ho usato i bean perche richiedevo dati differenti
    
    //eseguo le query dell 'area amministratore, cioe cosa devo far vedere,(fatture di tutti i clienti)
    
    
    
    //query cosa far vedere nell area cliente , eseguo le query (fatture del singolo cliente)

    /**
     * Metodo che si occupa di cercare tutti i prodotti acquistati da un cliente
     * @param codice_fiscale - il codice fiscale del cliente di cui si vogliono conoscere i prodotti acquistati
     * pre: codice_codice.length() == 16
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void querycliente(String codice_fiscale) throws ClassNotFoundException, SQLException{
        Connection conn=(Connection) ConnessioneDatabase.getConnection();
        Statement st=conn.createStatement();
        Statement st2=conn.createStatement();
        String query="select nome,cognome,via,cap,cf,codice_fattura,dataF from fattura,Utente where cliente=cf and cf='"+codice_fiscale+"';";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            AmministratoreUtente ogg_amministratore_cli=new AmministratoreUtente();
            ArrayList<FotoAcquisto> lista_ogg_amministratore=new ArrayList<>();
            
            ogg_amministratore_cli.setData(rs.getString("dataF"));
            ogg_amministratore_cli.setNome(rs.getString("nome"));
            ogg_amministratore_cli.setCognome(rs.getString("cognome"));
            ogg_amministratore_cli.setVia(rs.getString("via"));
            ogg_amministratore_cli.setCap(rs.getString("cap"));
            ogg_amministratore_cli.setNum_fattura(rs.getString("codice_fattura"));
            
            
            st2=conn.createStatement();
            String query2="select descrizione,quantita as num,path,acquisto.prodotto as prodotto  from acquisto,foto where acquisto.prodotto=foto.prodotto and fattura='"+rs.getString("codice_fattura")+"' group by acquisto.prodotto";
            ResultSet rs2 = st2.executeQuery(query2);
            
            while(rs2.next()){
                FotoAcquisto ogg_amministratore=new FotoAcquisto();
                ogg_amministratore.setDescrizione(rs2.getString("descrizione"));
                ogg_amministratore.setNum(rs2.getInt("num"));
                ogg_amministratore.setPath(rs2.getString("path"));
                ogg_amministratore.setCod_prodotto(rs2.getString("prodotto"));
                System.out.println("................... ......... .......... cod_prodotto: "+rs2.getString("prodotto")+"oggetto ora"+ogg_amministratore.getCod_prodotto());
                
                ogg_amministratore_cli.addLista_ogg_amministratore(ogg_amministratore);
                
            }
            rs2.close();
            
            lista_ogg_amministratore_cli.add(ogg_amministratore_cli);
            System.out.println("codice fattura: "+ogg_amministratore_cli.getNum_fattura());
            
        }
        
        rs.close();
        
        
        for(int i=0;i<lista_ogg_amministratore_cli.size();i++){
            System.out.println("prova, cod_fattura"+lista_ogg_amministratore_cli.get(i).getNum_fattura()+" indice "+i);
            
        }
        
        
    }
    
    /**
     * Metodo get per avere la lista dei prodotti acquistati
     * @return - la lista dei prodotti acquistati
     */
    public ArrayList<AmministratoreUtente> getLista_ogg_amministratore_cli() {
        return lista_ogg_amministratore_cli;
    }

    /**
     * Metodo set per settare la lista dei prodotti acquistati
     * @param lista_ogg_amministratore_cli - lista dei prodotti 
     */
    public void setLista_ogg_amministratore_cli(ArrayList<AmministratoreUtente> lista_ogg_amministratore_cli) {
        this.lista_ogg_amministratore_cli = lista_ogg_amministratore_cli;
    }
    
}