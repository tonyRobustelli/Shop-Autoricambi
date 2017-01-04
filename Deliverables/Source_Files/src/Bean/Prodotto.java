package Bean;

public class Prodotto {
	private String cod_pezzo;
	private String marchio;
	private String modello;
	private float prezzo;
	private boolean offerta;
	private float PrezzoScontato;
	
	private String descrizione;
	private int quantita;
	
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

	public String getCod_pezzo() {
		return cod_pezzo;
	}

	public void setCod_pezzo(String cod_pezzo) {
		this.cod_pezzo = cod_pezzo;
	}

	public String getMarchio() {
		return marchio;
	}

	public void setMarchio(String marchio) {
		this.marchio = marchio;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isOfferta() {
		return offerta;
	}

	public void setOfferta(boolean offerta) {
		this.offerta = offerta;
	}

	public float getPrezzo_scontato() {
		return PrezzoScontato;
	}

	public void setPrezzo_scontato(float PrezzoScontato) {
		this.PrezzoScontato = PrezzoScontato;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

}
