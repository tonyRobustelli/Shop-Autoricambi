<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" import="java.util.*"%>

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

<section class="prodotti">

    <%
        ArrayList<ProdottoFoto> array_prodotto = (ArrayList<ProdottoFoto>) request.getAttribute("array_prodotto");
        ProdottoFoto prodotto_foto = new ProdottoFoto();
        Prodotto prodotto_bean = new Prodotto();
        Foto foto_bean = new Foto();

        for (int i = 0; i < array_prodotto.size(); i++) {

            prodotto_foto = array_prodotto.get(i);
            foto_bean = prodotto_foto.getFoto_bean();
            prodotto_bean = prodotto_foto.getProdotto_bean();

    %>
    <div class="prodotto_singolo">
        <a href="scheda.jsp?cod_pezzo=<%=prodotto_bean.getCod_pezzo()%>" ><img src="images/<%=foto_bean.getPath()%>" ></a>
        <p><%=prodotto_bean.getDescrizione()%></p>
        <span><% if (prodotto_bean.isOfferta()) {%> 
            <del style="color:#747575;"><%=prodotto_bean.getPrezzo()%>&euro; </del> <%=prodotto_bean.getPrezzo_scontato()%>&euro; <%}%> 
            <% if (!prodotto_bean.isOfferta()) {%> <%=prodotto_bean.getPrezzo()%>&euro; <%}%> </span>
        <br><br>
        <a class="det_prod" href="scheda.jsp?cod_pezzo=<%=prodotto_bean.getCod_pezzo()%>" >dettagli</a>

    </div>

    <% }%>
</section>

<%@ include file="footer.jsp" %>