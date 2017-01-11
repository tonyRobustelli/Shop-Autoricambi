package Bean;

/**
 *
 * In base all'ogetto mi prendo l'imaggine appropriata, ci permette di realizzare 
 * la relazione tra foto e prodotti
 * 
 * 
 */
public class ProdottoFoto {

	private Prodotto prodotto_bean;
	private Foto foto_bean;

    /**
     * Costruttore di ProdottoFoto, esso setta le variabili di stato
     */
    public ProdottoFoto(){
		setProdotto_bean(null);
		setFoto_bean(null);
	}

    /**
     * ritorna l'istanza di un oggetto prodotto 
     * @return prodotto_bean
     * post: prodotto_bean
     */
    public Prodotto getProdotto_bean() {
		return prodotto_bean;
	}

    /**
     *  Setta l'oggetto prodotto
     * @param prodotto_bean
     * pre: prodotto_bean
     */
    public void setProdotto_bean(Prodotto prodotto_bean) {
		this.prodotto_bean = prodotto_bean;
	}

    /**
     * Ritorna un oggetto Foto 
     * @return foto_bean
     * post: foto_bean
     */
    public Foto getFoto_bean() {
		return foto_bean;
	}

    /**
     * Setta un oggetto Foto
     * @param foto_bean
     * pre: foto_bean
     */
    public void setFoto_bean(Foto foto_bean) {
		this.foto_bean = foto_bean;
	}
}
