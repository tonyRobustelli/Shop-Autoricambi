<!DOCTYPE html>
<html>
    <head>
        <title>shop-autoricambi</title>
        <link rel="stylesheet"  href="css/styles.css"  type="text/css">
        <link rel='stylesheet'  href='css/max_large.css' />
        <link rel='stylesheet' media='screen and (max-width: 960px)' href='css/large.css' />
        <link rel='stylesheet' media='screen and (max-width: 768px)' href='css/medium.css' />
        <link rel='stylesheet' media='screen and (max-width: 640px)' href='css/small.css' />
        <link href='http://fonts.googleapis.com/css?family=Oswald' rel='stylesheet' type='text/css'>
        <script src="script/ValidazioneForm.js" type="text/javascript"></script>

    </head>
    <body>
        <link rel="import" href="in.html">
        <header>
            <div class="alto"><p align="right">assistenza clienti: 333 33 33 333</p></div>
            <div class="logo">
                <img class="icona_logo" src="images/logo.png" alt="logo"/><span class="scritta_logo">shop-autoricambi</span>
                <%@ page contentType="text/html; charset=UTF-8" import="java.util.*,Bean.*"%>

                <%  Utente utente = (Utente) session.getAttribute("Utente");
                     if (utente != null) {
                         if (utente.isAmministratore()) {%>
                <span class="box"><a href="areammi.jsp">Area Amministratore</a></span>
                <%}
           }%>

                <%  utente = (Utente) session.getAttribute("Utente");
            if (utente != null) {
                if (!utente.isAmministratore()) {%>
                <span class="box"><a href="areacli.jsp">Area Cliente</a></span>
                <%}
           }%>

                <%  utente = (Utente) session.getAttribute("Utente");
            if (utente == null) {%>

                <span class="box"><a href="login.jsp">Login</a></span>
                <%}%>


            </div>
