package storico;

public class StoricoCliente_Manager {
    
    
    private ArrayList<AmministratoreUtente> lista_ogg_amministratore_cli;

    public StoricoCliente_Manager(){
        
        lista_ogg_amministratore_cli=new ArrayList<>();
    }
    
    public ArrayList<AmministratoreUtente> getLista_ogg_amministratore_cli() {
        return lista_ogg_amministratore_cli;
    }

    public void setLista_ogg_amministratore_cli(ArrayList<AmministratoreUtente> lista_ogg_amministratore_cli) {
        this.lista_ogg_amministratore_cli = lista_ogg_amministratore_cli;
    }
    
}