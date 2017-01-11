package Bean;

/**
 * Rappresenta un entità 
 * 
 */
public class Fattura {
	private int CodiceFattura;
	private String data;
	private float costototale;
	private float pagamento;
	private String utente;
	
    /**
     * Costruttore, esso setta le variabili di stato
     */
    public Fattura(){
		setFattura(0);
		setData(null);
		setCosto_totale(0);
		setPagamento(0);
		setCliente("");
		
	}

    /**
     * Ritorna l'identificativo della fattura
     * @return CodiceFattura
     */
    public int getFattura() {
		return this.CodiceFattura;
	}

    /**
     * Setta l'identificativo della fattura
     * @param fattura
     */
    public void setFattura(int fattura) {
		this.CodiceFattura = fattura;
	}

    /**
     * Ritorna la data di emissione della fattura
     * @return data
     */
    public String getData() {
		return data;
	}

    /**
     * Setta la data di emissione della fattura
     * @param data
     */
    public void setData(String data) {
		this.data = data;
	}

    /**
     * Ritorna il la spesa del cliente
     * post: costototale maggiore 0
     * @return costototale
     */
    public float getCosto_totale() {
		return costototale;
	}

    /**
     * Setta il totale che il cliente deve pagare
     * @param costototale
     * pre: costototale maggiore di 0
     */
    public void setCosto_totale(float costototale) {
		this.costototale = costototale;
	}

    /**
     * ritorna il pagamento emesso
     * @return pagamento
     */
    public float getPagamento() {
		return pagamento;
	}

    /**
     * Setta il pagamento emesso
     * @param pagamento
     */
    public void setPagamento(float pagamento) {
		this.pagamento = pagamento;
	}

    /**
     * Ritorna l'identificativo del cliente 
     * @return utente
     * post: utente!=null
     */
    public String getCliente() {
		return utente;
	}

    /**
     * Setto l'identificativo del cliente
     * @param utente
     * pre: utente!=null
     */
    public void setCliente(String utente) {
		this.utente = utente;
	}

}
