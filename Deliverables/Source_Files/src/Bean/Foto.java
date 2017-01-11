package Bean;

/**
 * Rappresenta un entità  
 * 
 */
public class Foto{
    private String path;
    private String prodotto;
    
    /**
     * Costruttore, esso setta le variabili di stato
     */
    public Foto(){
        setPath("");
        setProdotto("");
        
        
    }
    
    /**
     * Ritorna l'identificativo di un oggetto prodotto
     * @return prodotto 
     * post: prodotto!=null
     */
    public String getProdotto() {
        return prodotto;
    }
    
    /**
     * Setta l'identificativo di un oggetto prodotto
     * @param prodotto
     * pre: prodotto!=null
     */
    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    /**
     * Ritorna il path della foto  
     * @return path
     * post: path!=null
     */
    public String getPath() {
        return path;
    }

    /**
     * Setta il path della foto
     * @param path
     * pre: path!=null
     */
    public void setPath(String path) {
        this.path = path;
    }
   
}
