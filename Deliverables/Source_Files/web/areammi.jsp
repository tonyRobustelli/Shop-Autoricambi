<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" import="storico.*"%>

<%   utente = (Utente) session.getAttribute("Utente");
                            if (utente == null) {%>
<script>
    window.navigate("index.jsp")
</script>  
<%} else if (!utente.isAmministratore()) { %>
<script>
    window.navigate("areacli.jsp")
</script> 
<% } %>

</header>
<div class="bloccocos"> 
    <h1 class="bloccoscricos">
        Area Amministratore	 
    </h1>
</div> 

<div class="staccoarticoli"></div>

<section class="shop_dx">
    <img src="images/pattini_scheda.jpg">

    <img src="images/pattini_scheda.jpg">

    <img src="images/pattini_scheda.jpg">
</section>



<article class="formofficina">	
    <form method="post"  action="logout">
        <input type="submit" class="bottone"  style="width:150px"  value="Logout">
    </form>
    <%

        StoricoGestore_Manager query = new StoricoGestore_Manager();
        query.queryutente();

        ArrayList<AmministratoreUtente> lista_amministratoreCli = query.getLista_ogg_amministratore_cli();
        if (lista_amministratoreCli != null) {
            //System.out.println("\n num totale di fatture"+lista_amministratoreCli.size());
            for (int i = 0; i < lista_amministratoreCli.size(); i++) {
                //System.out.println("\n numero di fattura correnteeeeeeee........."+(lista_amministratoreCli.get(i)).getNum_fattura());

    %>
    <h3 class="headseconarti">	</h3>
    <div class="testoarticoli"> &nbsp &nbspNome:<%=lista_amministratoreCli.get(i).getNome()%>, &nbsp &nbsp  Cognome:<%=lista_amministratoreCli.get(i).getCognome()%>, &nbsp &nbsp Codice Fattura:<%=lista_amministratoreCli.get(i).getNum_fattura()%></div>




    <table class="shop" style="margin-bottom:60px;">

        <tr style="background-color:gray; color:#fff;" >
            <td>Data Acquisto</td>
            <td>Foto </td>
            <td>Descrizione</td>
            <td>Ind. Spedizione</td>
            <td>Quantita'</td>

        </tr>
        <%ArrayList<FotoAcquisto> lista_amministratore = lista_amministratoreCli.get(i).getLista_ogg_amministratore();
            if (lista_amministratoreCli != null) {
                //System.out.println("grandezza num prod per fattura"+i+" .. "+lista_amministratore.size());
                for (int j = 0; j < lista_amministratore.size(); j++) {


        %>
        <tr >
            <td> 
                <%=lista_amministratoreCli.get(i).getData()%>
            </td>
            <td> <a  href="scheda.jsp?cod_pezzo=<%=lista_amministratore.get(j).getCod_prodotto()%>"><img style="width:100%;" src="images/<%=lista_amministratore.get(j).getPath()%>" ></a></td>
            <td><%=lista_amministratore.get(j).getDescrizione()%></td>
            <td>via: <%=lista_amministratoreCli.get(i).getVia()%>, <br> cap: <%=lista_amministratoreCli.get(i).getCap()%></td>
            <td><%=lista_amministratore.get(j).getNum()%></td>

        </tr>

        <%}
                                    }%>


    </table>

    <%}
                                    }%>

</article>

</section>

<%@ include file="footer.jsp" %>