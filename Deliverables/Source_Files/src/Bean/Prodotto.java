package Bean;

/**
 * Rappresenta un entità 
 * 
 */
public class Prodotto {
	private String cod_pezzo;
	private String marchio;
	private String modello;
	private float prezzo;
	private boolean offerta;
	private float PrezzoScontato;
	
	private String descrizione;
	private int quantita;
	
    /**
     * Costruttore, esso setta le variabili di stato
     */
    public Prodotto(){
		setCod_pezzo("");
		setMarchio("");
		setModello("");
		setPrezzo(0);
		setOfferta(false);
		setPrezzo_scontato(0);
		setDescrizione("");
		setQuantita(0);
		
	}

    /**
     * ritorna l'identificativo di un prodotto
     * @return cod_pezzo
     * post: cod_pezzo!=null
     */
    public String getCod_pezzo() {
		return cod_pezzo;
	}

    /**
     * Setta l'identificativo di un prodotto
     * @param cod_pezzo
     * pre: cod_pezzo!=null
     */
    public void setCod_pezzo(String cod_pezzo) {
		this.cod_pezzo = cod_pezzo;
	}

    /**
     * Ritorno il marchio del prodotto
     * @return marchio
     * post: marchio!=null
     */
    public String getMarchio() {
		return marchio;
	}

    /**
     * Setto il marchio del prodotto
     * @param marchio
     * pre: marchio!=null
     */
    public void setMarchio(String marchio) {
		this.marchio = marchio;
	}

    /**
     * Ritorno il modello del prodotto
     * @return modello 
     * post: modello!=null
     */
    public String getModello() {
		return modello;
	}

    /**
     * Setto il modello del prodotto
     * @param modello
     * pre: modello
     */
    public void setModello(String modello) {
		this.modello = modello;
	}

    /**
     * Ritorno il prezzo del prodotto
     * @return prezzo
     * post: prezzo maggiore di 0
     */
    public float getPrezzo() {
		return prezzo;
	}

    /**
     * Setto il prezzo del prodotto
     * @param prezzo
     * pre: prezzo maggiore di 0
     */
    public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

    /**
     * Ritorno un valore booleano, che indica se il prodotto e' in offerta o meno
     * @return offerta
     */
    public boolean isOfferta() {
		return offerta;
	}

    /**
     * Setto con un valore booleano se il prodotto e' in offerta, 
     * true, in offerta
     * false altrimenti
     * @param offerta
     */
    public void setOfferta(boolean offerta) {
		this.offerta = offerta;
	}

    /**
     * Ritorna il prezzo scontato
     * @return PrezzoScontato
     * post: PrezzoScontato maggiore di 0
     */
    public float getPrezzo_scontato() {
		return PrezzoScontato;
	}

    /**
     * Setto il prezzo scontato
     * @param PrezzoScontato
     * pre: PrezzoScontato
     */
    public void setPrezzo_scontato(float PrezzoScontato) {
		this.PrezzoScontato = PrezzoScontato;
	}

    /**
     * Ritorno la descrizione del prodotto
     * @return descrizione
     * post: descrizione!=null
     */
    public String getDescrizione() {
		return descrizione;
	}

    /**
     * Setto la descrizione del prodotto
     * @param descrizione
     * pre: edescrizione!=null
     */
    public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

    /**
     * ritorno la quantita' di prodotto disponibile
     * @return
     * post: quantita
     */
    public int getQuantita() {
		return quantita;
	}

    /**
     * Setto la quantita' di prodotto disponibile
     * @param quantita
     * pre: quantita
     */
    public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

}
