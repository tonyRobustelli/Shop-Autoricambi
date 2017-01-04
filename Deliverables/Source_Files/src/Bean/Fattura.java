package Bean;

public class Fattura {
	private int CodiceFattura;
	private String data;
	private float costototale;
	private float pagamento;
	private String utente;
	
	
	public Fattura(){
		setFattura(0);
		setData(null);
		setCosto_totale(0);
		setPagamento(0);
		setCliente("");
		
	}

	public int getFattura() {
		return this.CodiceFattura;
	}

	public void setFattura(int fattura) {
		this.CodiceFattura = fattura;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public float getCosto_totale() {
		return costototale;
	}

	public void setCosto_totale(float costototale) {
		this.costototale = costototale;
	}

	public float getPagamento() {
		return pagamento;
	}

	public void setPagamento(float pagamento) {
		this.pagamento = pagamento;
	}

	public String getCliente() {
		return utente;
	}

	public void setCliente(String utente) {
		this.utente = utente;
	}
}