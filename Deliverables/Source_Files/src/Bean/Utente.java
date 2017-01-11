package Bean;

import java.util.Date;

/**
 * Rappresenta un entità
 * 
 */
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
        
    /**
     * Costruttore di ProdottoFoto, esso setta le variabili di stato
     */
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

    /**
     * Ritorno il nome dell'utente
     * @return nome
     * post: nome!=null
     */
    public String getNome() {
		return nome;
	}

    /**
     * Setto il nome dell'utente
     * @param nome
     * pre: nome!=null
     */
    public void setNome(String nome) {
		this.nome = nome;
	}

    /**
     * Ritorno il cognome dell'utente
     * @return cognome
     * post: cognome!=null
     */
    public String getCognome() {
		return cognome;
	}

    /**
     * Setto il cognome dell'utente
     * @param cognome
     * pre: cognome!=null
     */
    public void setCognome(String cognome) {
		this.cognome = cognome;
	}

    /**
     * Ritorno la citta dell'utente
     * @return citta
     * post: citta!=null
     */ 
    public String getCitta() {
		return citta;
	}

    /**
     * Setto la citta dell'utente
     * @param citta
     * pre: citta!=null
     */
    public void setCitta(String citta) {
		this.citta = citta;
	}

    /**
     * Ritorno il numero di telefono dell'utente
     * @return telefono
     * post: telefono!=null
     */
    public String getTelefono() {
		return telefono;
	}

    /**
     * Setto il numero di telefono dell'utente
     * @param telefono
     * pre: telefono!=null
     */
    public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    /**
     * Ritorno il numero di cellulare dell'utente
     * @return cell
     * post: cell!=null
     */
    public String getCellulare() {
		return cell;
	}

    /**
     * Setto il numero di cellulare dell'utente
     * @param cellulare
     * pre: cellulare!=null
     */
    public void setCellulare(String cellulare) {
		this.cell = cellulare;
	}

    /**
     * Ritorno l'email dell'utente
     * @return email
     * post: email!=null
     */
    public String getEmail() {
		return email;
	}

    /**
     * Setto l'email dell'utente
     * @param email
     * pre: email!=null
     */
    public void setEmail(String email) {
		this.email = email;
	}

    /**
     * Ritorno la password dell'utente
     * @return password
     * post: password diverso da null e password.length() maggiore 7 e deve contenere almeno: una lettera maiuscola, miniscola, carattere e numero
     */
    public String getPassword() {
		return password;
	}

    /**
     * Setto la password dell'utente
     * @param password
     * pre: password!=null
     */
    public void setPassword(String password) {
		this.password = password;
	}

    /**
     * Ritorno la via dell'utente
     * @return via
     * post: via!=null
     */
    public String getVia() {
		return via;
	}

    /**
     * Setto la via dell'utente
     * @param via
     * pre: via!=null
     */
    public void setVia(String via) {
		this.via = via;
	}

    /**
     * Ritorno il cap dell'utente
     * @return cap
     * post: cap!=null
     */
    public String getCap() {
		return cap;
	}

    /**
     * Setto il cap dell'utente
     * @param cap
     * pre: cap!=null
     */
    public void setCap(String cap) {
		this.cap = cap;
	}

    /**
     * Ritorno un valore booleano che indica se l'utente e' amministratore
     * true, se e' amministratore
     * false altrimenti
     * @return ammnistratore
     */
    public boolean isAmministratore() {
		return amministratore;
	}

    /**
     * Setto il valore booleano che indica se l'utente e' amministratore
     * true, se e' amministratore
     * false altrimenti
     * @param amministratore
     */
    public void setAmministratore(boolean amministratore) {
		this.amministratore = amministratore;
	}

    /**
     * Setta la data di nascita dell'utente
     * @param string
     * pre: string!=null
     */
    public void setDataNascita(String string) {
       this.datanascita=string;
    }

    /**
     * Ritorna la data di nascita dell'utente
     * @return datanascita
     * post: datanascita!=null
     */
    public String getDataNascita(){
        return this.datanascita;
    }
        
    /**
     * Setto il codica fiscale dell'utente
     * @param string
     * pre: string!=null
     */
    public void setCodiceFiscale(String string) {
        this.CodiceFiscale=string;
    }
    
    /**
     * Setto ilcodice fiscale dell'utente
     * @return CodiceFiscale
     * post: CodiceFiscale!=null
     */
    public String getCodiceFiscale(){
        return this.CodiceFiscale;
    }
	
	

}
