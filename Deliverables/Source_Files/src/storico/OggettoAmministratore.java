package storico;

/**
 * Classe che istanzia oggetti che contengono informazioni sulla foto e il 
 * corrispondente prodotto
 */
public class OggettoAmministratore {
	
private String descrizione;
private int num;
private String path;
private String cod_prodotto;

    /**
     * Costruttore Vuoto
     */
    public OggettoAmministratore(){
		this.setDescrizione("");
		this.setNum(0);
		this.setPath("");
		this.setCod_prodotto("");
	}

    /**
     * Metodo get per restituire la descrizione del prodotto
     * post: descrizione != null
     * @return restituisce la descrizione del prodotto
     */
    public String getDescrizione() {
		return descrizione;
	}

    /**
     * Metodo set per settare la descrizione del prodotto
     * pre: descrizione != null
     * @param descrizione - descrizione del prodotto
     */
    public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

    /**
     * Metodo get che restituisce il numero inerente alla foto
     * post: num maggiore o uguale a 0
     * @return - il numero inerente alla foto
     */
    public int getNum() {
		return num;
	}

    /**
     * Metodo set per settare il numero inerente alla foto
     * pre: num maggiore o uguale a  0
     * @param num - il numero della foto
     */
    public void setNum(int num) {
		this.num = num;
	}

    /**
     * Metodo get che restituisce il path relativo alla foto del prodotto
     * post: path diverso da  null
     * @return - il path della foto
     */
    public String getPath() {
		return path;
	}

    /**
     * Metodo set per settare il path della foto relativa al prodotto
     * pre: path != null
     * @param path - il path della foto
     */
    public void setPath(String path) {
		this.path = path;
	}

    /**
     * Metodo get per restituire il codice del prodotto
     * post: cod_prodotto != null
     * @return - il codice del prodotto
     */
    public String getCod_prodotto() {
		return cod_prodotto;
	}

    /**
     * Metodo set per restituire il codice del prodotto
     * pre: cod_prodotto != null 
     * @param cod_prodotto - il codice del prodotto
     */
    public void setCod_prodotto(String cod_prodotto) {
		this.cod_prodotto = cod_prodotto;
	}
}