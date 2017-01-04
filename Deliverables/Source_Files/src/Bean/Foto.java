package Bean;

public class Foto{
    private String path;
    private String prodotto;
    
    
    public Foto(){
        setPath("");
        setProdotto("");
    }
    
    public String getProdotto() {
        return prodotto;
    }
    
    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }
    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
}
