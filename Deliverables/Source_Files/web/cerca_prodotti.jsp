</header>
<div class="bloccocos"> 
    <div class="bloccoscricos">
        Prodotti 
    </div>
</div> 

<form class="form_prodotti" method="POST" action="ProdottiControl">
    <input type="hidden" name="azione" value="cerca"> 
    <div class="inp">
        Codice Pezzo<br><input type="tetx" name="cod_pezzo">
    </div>
    <div class="inp">
        Marchio<br><input type="tetx" name="marchio">
    </div>
    <div class="inp">
        Modello<br><input type="tetx" name="modello">
    </div>

    <input class="bottone" value="Ricerca" type="submit">
</form>
