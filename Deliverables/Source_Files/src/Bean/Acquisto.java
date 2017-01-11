package Bean;

/**
 * Rappresenta un entità 
 * 
 */
public class Acquisto {
	private int codice_acquisto;
	private String descrizione;
	private int fattura;
	private String prodotto;
	
    /**
     * Costruttore, esso setta le variabili di stato
     */
    public Acquisto(){
		setCodice_acquisto(0);
		setDescrizione("");
		setFattura(0);
		setProdotto("");
	}

    /**
     * ritorna l'identificativo di un acquisto 
     * @return codice_acquisto 
     */
    public int getCodice_acquisto() {
		return codice_acquisto;
	}

    /**
     * Setto l'identificativo di un acquisto 
     * @param codice_acquisto
     */
    public void setCodice_acquisto(int codice_acquisto) {
		this.codice_acquisto = codice_acquisto;
	}

    /**
     * ritorna la descrizione dell'acquisto
     * @return descrizione
     */
    public String getDescrizione() {
		return descrizione;
	}

    /**
     * Setta la descrizione dell'acquisto
     * @param descrizione
     * pre: descrizione diverso da null
     */
    public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

    /**
     * Ritorna l'identificativo di una fattura
     * @return fattura
     */
    public int getFattura() {
		return fattura;
	}

    /**
     * Setta l'identificativo di una fattura
     * @param fattura
     */
    public void setFattura(int fattura) {
		this.fattura = fattura;
	}

    /**
     * Ritorna l'identificativo di un prodotto 
     * @return prodotto
     * post: prodoto!=null
     */
    public String getProdotto() {
		return prodotto;
	}

    /**
     * Setta l'identificati di un prodotto
     * @param prodotto
     * pre: prodotto!=null
     */
    public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
}
