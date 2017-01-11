<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
    $(document).ready(function () {

        $("p").click(function () {

            //se clicco dico che nav è presente, se riclicco ritorno al caso precedente eco perche toggle
            $("nav").toggleClass("con_nav");

            //lo stesso anche qui al click modifico la classe di ul cambiandola con questa, se clicco di nuovo 
            //rtorno allo stato precedente
            $("nav ul").toggleClass("con_nav_ul");
        });
    });
</script>

<nav class="senza_nav">
    <p>Menu</p>
    <ul class="senza_nav_ul" >
        <a href="index.jsp"><li></li></a>
        <li><a href="shop_autoricambi.jsp">CHE COS'E'</a></li>
        <li><a href="servizi.jsp">SERVIZI</a></li>
        <li><a href="prodotti.jsp">PRODOTTI</a></li>
        <li><a href="contatti.jsp">CONTATTI</a></li>
    </ul>

</nav>