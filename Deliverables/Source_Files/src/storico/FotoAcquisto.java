package storico;


public class FotoAcquisto {
	
private String descrizione;
private int num;
private String path;
private String cod_prodotto;

   
    public FotoAcquisto(){
		this.setDescrizione("");
		this.setNum(0);
		this.setPath("");
		this.setCod_prodotto("");
	}


    public String getDescrizione() {
		return descrizione;
	}

    public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

    public int getNum() {
		return num;
	}

   
    public void setNum(int num) {
		this.num = num;
	}

  
    public String getPath() {
		return path;
	}


    public void setPath(String path) {
		this.path = path;
	}


    public String getCod_prodotto() {
		return cod_prodotto;
	}

    public void setCod_prodotto(String cod_prodotto) {
		this.cod_prodotto = cod_prodotto;
	}
}
