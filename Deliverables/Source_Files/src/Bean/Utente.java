package Bean;

public class Utente {
	private String CodiceFiscale;
	private String cap;
	private String via;
    private String citta;
	private String nome;
	private String cognome;
	private String datanascita;
	private String telefono;
	private String cell;
	private String email;
	private String password;
	private boolean amministratore;
        
	
	
	public Utente(){
		setCodiceFiscale("");
		setCap("");
		setVia("");
		setNome("");
		setCognome("");
		setDataNascita("");
		setTelefono("");
		setCellulare("");
		setEmail("");
		setPassword("");
		setAmministratore(false);
        setCitta("");
	}






	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


        public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}



	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCellulare() {
		return cell;
	}


	public void setCellulare(String cellulare) {
		this.cell = cellulare;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getVia() {
		return via;
	}


	public void setVia(String via) {
		this.via = via;
	}


	public String getCap() {
		return cap;
	}


	public void setCap(String cap) {
		this.cap = cap;
	}


	public boolean isAmministratore() {
		return amministratore;
	}


	public void setAmministratore(boolean amministratore) {
		this.amministratore = amministratore;
	}

    public void setDataNascita(String string) {
       this.datanascita=string;
    }

    public String getDataNascita(){
        return this.datanascita;
    }
        
    
    public void setCodiceFiscale(String string) {
        this.CodiceFiscale=string;
    }
    
    public String getCodiceFiscale(){
        return this.CodiceFiscale;
    }

}