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

</section>

<%@ include file="footer.jsp" %>
