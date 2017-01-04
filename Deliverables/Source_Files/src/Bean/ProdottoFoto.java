package Bean;

public class ProdottoFoto {
    private Prodotto prodotto_bean;
	private Foto foto_bean;

 
    public ProdottoFoto(){
		setProdotto_bean(null);
		setFoto_bean(null);
	}

    public Prodotto getProdotto_bean() {
		return prodotto_bean;
	}

  
    public void setProdotto_bean(Prodotto prodotto_bean) {
		this.prodotto_bean = prodotto_bean;
	}

   
    public Foto getFoto_bean() {
		return foto_bean;
	}


    public void setFoto_bean(Foto foto_bean) {
		this.foto_bean = foto_bean;
	}
}
