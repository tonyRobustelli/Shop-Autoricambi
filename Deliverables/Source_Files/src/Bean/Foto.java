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
     */
    public String getProdotto() {
        return prodotto;
    }
    
    /**
     * Setta l'identificativo di un oggetto prodotto
     * @param prodotto
     */
    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    /**
     * Ritorna il path della foto  
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * Setta il path della foto
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }
   
}
