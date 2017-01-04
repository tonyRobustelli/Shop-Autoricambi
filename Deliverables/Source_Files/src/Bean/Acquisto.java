package Bean;

public class Acquisto {
	private int codice_acquisto;
	private String descrizione;
	private int fattura;
	private String prodotto;
	
	public Acquisto(){
		setCodice_acquisto(0);
		setDescrizione("");
		setFattura(0);
		setProdotto("");
	}

	public int getCodice_acquisto() {
		return codice_acquisto;
	}

	public void setCodice_acquisto(int codice_acquisto) {
		this.codice_acquisto = codice_acquisto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getFattura() {
		return fattura;
	}

	public void setFattura(int fattura) {
		this.fattura = fattura;
	}

	public String getProdotto() {
		return prodotto;
	}

	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
}
