package storico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import Bean.Foto;
import Bean.Prodotto;
import Bean.ProdottoFoto;
import DBMS.ConnessioneDatabase;


public class AmministratoreUtente {
	private String nome;
	private String cognome;
	private String num_fattura;
	private String via;
	private String cap;
	private String data;
	private ArrayList<FotoAcquisto> lista_ogg_amministratore;
	
 
    public AmministratoreUtente(){
		this.setNome("");
		this.setCognome("");
		this.setNum_fattura("");
		this.setData("");
		this.setCap("");
		this.setVia("");
		lista_ogg_amministratore=new ArrayList<FotoAcquisto>();
	
	}
	      
   
    public String getNome() {
		return nome;
	}


    public void setNome(String nome) {
		this.nome = nome;
	}

    
    public String getCognome() {
		return cognome;
	}

  
    public void setCognome(String cognome) {
		this.cognome = cognome;
	}


    public String getNum_fattura() {
		return num_fattura;
	}

  
    public void setNum_fattura(String num_fattura) {
		this.num_fattura = num_fattura;
	}

    public String getVia() {
		return via;
	}

    public void setVia(String via) {
		this.via = via;
	}

    
    public String getCap() {
		return cap;
	}

  
    public void setCap(String cap) {
		this.cap = cap;
	}

 
    public ArrayList<FotoAcquisto> getLista_ogg_amministratore() {
		return lista_ogg_amministratore;
	}


    public void setLista_ogg_amministratore(ArrayList<FotoAcquisto> lista_ogg_amministratore) {
		lista_ogg_amministratore = lista_ogg_amministratore;
	}

 
    public void addLista_ogg_amministratore(FotoAcquisto lista_ogg_amm) {
		lista_ogg_amministratore.add(lista_ogg_amm);
	}

   
    public String getData() {
		return data;
	}

 
    public void setData(String data) {
		this.data = data;
	}
	
}
