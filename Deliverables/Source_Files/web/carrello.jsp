<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" import="javax.servlet.http.*,java.util.*"%>

</header>
<div class="bloccocos"> 
    <h1 class="bloccoscricos">
        Carrello	 
    </h1>
</div> 

<div class="staccoarticoli"></div>

<section class="shop_dx">
    <img src="images/pattini_scheda.jpg">

    <img src="images/pattini_scheda.jpg">

    <img src="images/pattini_scheda.jpg">
</section>



<article class="formofficina">	

    <h3 class="headseconarti">	</h3>
    <div class="testoarticoli">trovi l'elenco dei prodotti caricati nel carrello</div>




    <table class="shop">
        <tr style="background-color:gray; color:#fff;" >
            <td> </td>
            <td> </td>
            <td>Descrizione</td>
            <td>Prezzo</td>
            <td>Quantita'</td>
            <td>totale</td>
        </tr>
        <%
            ArrayList<ProdottoFoto> array_prod = (ArrayList<ProdottoFoto>) session.getAttribute("array_prodotto");
            Prodotto prod = null;
            Foto foto = null;
            float somma_p = 0, somma_t = 0;
            if (array_prod != null) {
                for (int i = 0; i < array_prod.size(); i++) {
                    prod = (Prodotto) array_prod.get(i).getProdotto_bean();
                    foto = (Foto) array_prod.get(i).getFoto_bean();
                    somma_t = somma_t + (prod.getQuantita() * prod.getPrezzo_scontato());
                    somma_p = prod.getQuantita() * prod.getPrezzo_scontato();

        %>
        <tr >
            <td> <form action="DelCarrelloControl" method="get">
                    <input type="hidden" name="cod_pezzo" value="<%=prod.getCod_pezzo()%>">
                    <input style="background-color:#fff; color:#000; border-color:#fff; font-size:22px;" class="bottone" type="submit" value="X">
                </form>
            </td>
            <td> <a  href="scheda.jsp?cod_pezzo=<%=prod.getCod_pezzo()%>"><img style="width:100%;" src="images/<%=foto.getPath()%>" ></a></td>
            <td><%=prod.getDescrizione()%></td>
            <td><%=prod.getPrezzo_scontato()%></td>
            <td><%=prod.getQuantita()%></td>
            <td><%=somma_p%></td>
        </tr>
        <%}
                                    }%>
        <tr >
            <td> </td>
            <td> </td>
            <td></td>
            <td></td>
            <td></td>
            <td><%=somma_t%></td>
        </tr>
        <tr>
        <form action="AcquistaControl" method="post">

            <td>


                <input style="font-size:22px;" class="bottone" type="submit" value="Acquista">
        </form>

        </td>
        </tr>

    </table>

</article>

</section>

<%@ include file="footer.jsp" %>