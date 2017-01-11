
<%@ include file="header.jsp" %>

<%@ include file="menu.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" import="java.util.*,Bean.*,ricerca.*"%>

<aside>
    <form  method="POST"  action="ProdottiControl">
        <p class="cerca">Cerca Prodotto</p>
        <input type="hidden" name="azione" value="cerca">
        Codice Pezzo<br><input type="text" name="cod_pezzo"><br>
        Marchio<br><input type="tetx" name="marchio"><br>
        Modello<br><input type="tetx" name="modello"><br>
        <input class="bottone" type="submit"  value="Ricerca"><br>
    </form>
</aside>
</header>

<section class="menu_rap">
    <div class="image_menu_rap">
        <a href="servizi.jsp" ><img src="images/partners.png" ></a>

    </div>
    <div class="image_menu_rap">
        <a href="contatti.jsp" ><img src="images/contatti.png" ></a>

    </div>

    <div class="image_menu_rap">
        <a href="shop_autoricambi.jsp" ><img src="images/blog.png" ></a>

    </div>

    <div class="image_menu_rap">
        <a href="prodotti.jsp" ><img src="images/prodotti.png" ></a>

    </div>

</section>



<section class="prodotti">
    <%
        RicercaProdotto_Manager ser = new RicercaProdotto_Manager();
        ArrayList<ProdottoFoto> array_prodotto = ser.lista_prodotti();
        ProdottoFoto prodotto_foto = new ProdottoFoto();
        Prodotto prodotto_bean = new Prodotto();
        Foto foto_bean = new Foto();

        for (int i = 0; i < array_prodotto.size() && i < 4; i++) {

            prodotto_foto = array_prodotto.get(i);
            foto_bean = prodotto_foto.getFoto_bean();
            prodotto_bean = prodotto_foto.getProdotto_bean();
            if (!prodotto_bean.isOfferta()) {
                continue;
            }
    %>
    <div class="prodotto_singolo">
        <a href="scheda.jsp?cod_pezzo=<%=prodotto_bean.getCod_pezzo()%>" ><img src="images/<%=foto_bean.getPath()%>" ></a>
        <p><%=prodotto_bean.getModello()%></p>

        <span><% if (prodotto_bean.isOfferta()) {%> 
            <del style="color:#747575;"><%=prodotto_bean.getPrezzo()%>&euro; </del> <%=prodotto_bean.getPrezzo_scontato()%>&euro; <%}%> 
            <% if (!prodotto_bean.isOfferta()) {%> <%=prodotto_bean.getPrezzo()%>&euro; <%}%> </span>


        <br><br>
        <a class="det_prod" href="scheda.jsp?cod_pezzo=<%=prodotto_bean.getCod_pezzo()%>">dettagli</a>
    </div>

    <% }%>

</section>



<%@ include file="footer.jsp" %>