<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" import="java.util.*,ricerca.RicercaProdotto_Manager"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        $("img").click(function () {
            var id = $(this).attr("id");
            //$("img")attr("class",".scheda_img_grd_invis");
            //$("img")attr("class",".scheda_img_grd_vis");
            //  $(".scheda_img_grd_vis")addClass("scheda_img_grd_invis"); 
            //$("#"+id+".scheda_img_grd_invis").addClass("scheda_img_grd_vis"); 


            //$("img")attr("class",".scheda_img_grd_invis");
            //$("img")attr("class",".scheda_img_grd_vis");

            //cambio il css, aggiungendo questo tag che rende invisibile, ma non come opacity
            //in questo caso è come se l'attributo fosse inesistente
            $("span img").css({"display": "none"}).ready(function () {
                //subito dopo eseguito quello precendete ecco perche uso ready come forma di attesa
                // dico di rendere visibile l'immagine con effetto fade in
                $("span #" + id).fadeIn("slow").css({"display": "block", "opacity": "1"});
            });


        });
    });
</script>



</header>
<div class="bloccocos"> 
    <div class="bloccoscricos">
        Prodotti 
    </div>
</div> 




<section class="scheda">
    <div class="scheda_img">
        <%
            RicercaProdotto_Manager query = new RicercaProdotto_Manager();
            String cod = (String) request.getParameter("cod_pezzo");
            ArrayList<Foto> array_foto = query.scheda_tecnica_foto(cod);
        %>

        <span class="fot">
            <img id="0" class="scheda_img_grd_vis" src="images/<%=array_foto.get(0).getPath()%>">
            <%
                for (int i = 1; i < array_foto.size(); i++) {
            %>
            <img id=<%=i%> class="scheda_img_grd_invis" src="images/<%=array_foto.get(i).getPath()%>">
            <%}%>
        </span>

        <div style="float:right; width:28%;">
            <% for (int i = 0; i < array_foto.size(); i++) {%>
            <img id=<%=i%> class="scheda_img_pic" src="images/<%=array_foto.get(i).getPath()%>"><%
            }%>
        </div>
    </div>

    <%

        Prodotto prodotto = query.scheda_tecnica_prodotto(cod);

    %>
    <div class="scheda_dati">
        <div class="titolo"><%=prodotto.getDescrizione()%> </div>
        <div class="caratt"><%=prodotto.getMarchio()%> <%=prodotto.getModello()%> </div>
        <div class="dati"><span class="euro">EURO</span><span class="prezzo"><%=prodotto.getPrezzo_scontato()%></span></div>

        <form name="campqua" action="CarrelloControl" method="post" onsubmit="return ControllaQuantita()">
            <input type="hidden" name="cod_pezzo" value="<%=prodotto.getCod_pezzo()%>">
            Quantita':<input  class="quantita" type="text" name="quantita" placeholder="Quantità">
            <input class="bottone" type="submit" value="Aggiungi la carrello">
        </form>

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
            if (cod.equals(prodotto_bean.getCod_pezzo())) {
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
