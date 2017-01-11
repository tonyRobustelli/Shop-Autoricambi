<%@ include file="header.jsp" %>

<%@ include file="menu.jsp" %>

</header>
<div class="bloccocos"> 
    <h1 class="bloccoscricos">
        Registrazione	 
    </h1>
</div> 

<div class="staccoarticoli"></div>

<section class="shop_dx">
    <img src="images/pattini_scheda.jpg">

    <img src="images/pattini_scheda.jpg">

    <img src="images/pattini_scheda.jpg">
</section>



<article class="formofficina">	

    <h3 class="headseconarti">Registrati al sito 	</h3>
    <div class="testoarticoli">Effettua la registrazione al sito per poter utilizzare i servizi offerti</div>
    <form class="shop" method="post" action="regclie" onsubmit="return ControllaCliente()" name="regcli">
        <input  type = "text" name = "nome" placeholder ="Nome" />
        <br>
        <input  type = "text" name = "cognome" placeholder ="Cognome" />
        <br>
        <input  type = "text" name = "codicefiscale" placeholder ="Codice fiscale" />
        <br>
        <input  type = "data" name = "datanascita" placeholder ="Data di nascita:GG/MM/AAAA" />
        <br>	
        <input  type = "text" name = "telefono" placeholder = "Telefono" />
        <br>
        <input  type = "text" name= "cellulare" placeholder = "Cellulare" />
        <br>
        <input  type = "text" name = "via" placeholder ="Via" />
        <br>
        <input  type = "text" name = "cap" placeholder="Cap" />	
        <br>
        <input type = "text" name = "citta" placeholder= "Citta'" />
        <br>				  
        <input type = "text" name = "email" placeholder= "E-mail" />
        <br>
        <input type = "password" name = "psw" placeholder = "Password" />
        <br>
        <input  type = "password" name = "pswconf" placeholder = "Conferma password" />
        <br>
        <input   type="submit" value="Registrati" class="bottone">
        <br>			   


    </form>


</article>

<%@ include file="footer.jsp" %>