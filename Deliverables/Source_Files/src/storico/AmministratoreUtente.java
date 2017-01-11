package storico;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import Bean.Foto;
import Bean.Prodotto;
import Bean.ProdottoFoto;
import DBMS.ConnessioneDatabase;

/**
 * Classe che gestisce la lista degli acquisti effettuati da un cliente
 */
public class AmministratoreUtente {
	private String nome;
	private String cognome;
	private String num_fattura;
	private String via;
	private String cap;
	private String data;
	private ArrayList<FotoAcquisto> lista_ogg_amministratore;
	
    /**
     * Costruttore vuoto
     */
    public AmministratoreUtente(){
		this.setNome("");
		this.setCognome("");
		this.setNum_fattura("");
		this.setData("");
		this.setCap("");
		this.setVia("");
		lista_ogg_amministratore=new ArrayList<FotoAcquisto>();
	
	}
	      
    /**
     * Metodo get che restituisce il nome del cliente
     * post: nome != null
     * @return restituisce il nome del cliente
     */
    public String getNome() {
		return nome;
	}

    /**
     * Metodo set per settare il nome del cliente
     * pre: nome != null
     * @param nome - il nome del cliente
     */
    public void setNome(String nome) {
		this.nome = nome;
	}

    /**
     * Metodo get che restituisce il cognome del cliente
     * post: cognome != null
     * @return restituisce il cognome del cliente
     */
    public String getCognome() {
		return cognome;
	}

    /**
     * Metodo set per settare il cognome del cliente
     * pre: cognome != null
     * @param cognome - restituisce il cognome del cliente
     */
    public void setCognome(String cognome) {
		this.cognome = cognome;
	}

    /**
     * Metodo get che restituisce il numero della fattura
     * post: num_fattura != null
     * @return restituisce il numero della fattura
     */
    public String getNum_fattura() {
		return num_fattura;
	}

    /**
     * Metodo set per settare il numero della fattura
     * pre: num_fattura != null
     * @param num_fattura - il numero della fattura
     */
    public void setNum_fattura(String num_fattura) {
		this.num_fattura = num_fattura;
	}

    /**
     * Metodo get che restituisce la via
     * post: via != null
     * @return restituisce la via dove vive il cliente
     */
    public String getVia() {
		return via;
	}

    /**
     * Meotodo set per settare la via 
     * pre: via != null
     * @param via - la via dove vive il cliente
     */
    public void setVia(String via) {
		this.via = via;
	}

    /**
     * Metodo get che restituisce il CAP
     * post: cap != null
     * @return restituisce il CAP
     */
    public String getCap() {
		return cap;
	}

    /**
     * Metodo set per settare il CAP
     * pre: cap != null
     * @param cap - il CAP
     */
    public void setCap(String cap) {
		this.cap = cap;
	}

    /**
     * Metodo get che restituisce la lista dei prodotti acquistati dal cliente
     * post: lista_ogg_amministratore != null
     * @return restituisce la lista dei prodotti acquistati
     */
    public ArrayList<FotoAcquisto> getLista_ogg_amministratore() {
		return lista_ogg_amministratore;
	}

    /**
     * Metodo set per settare la lista di prodotti acquistati dal cliente
     * pre: lista_ogg_amministratore != null
     * @param lista_ogg_amministratore
     */
    public void setLista_ogg_amministratore(ArrayList<FotoAcquisto> lista_ogg_amministratore) {
		lista_ogg_amministratore = lista_ogg_amministratore;
	}

    /**
     * Metodo per aggiungere un singolo acquisto nella lista degli acquisti effettuati
     * pre: lista_ogg_amministratore != null
     * @param lista_ogg_amm
     */
    public void addLista_ogg_amministratore(FotoAcquisto lista_ogg_amm) {
		lista_ogg_amministratore.add(lista_ogg_amm);
	}

    /**
     * Metodo get che restituisce la data dell'acquisto
     * post: data != null
     * @return retituisce la data dell'acquisto
     */
    public String getData() {
		return data;
	}

    /**
     * Metodo set che setta la data dell'acquisto
     * pre: data != null
     * @param data - la data dell'acquisto
     */ 
    public void setData(String data) {
		this.data = data;
	}
	
}
