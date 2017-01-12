<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>

</header>

<div class="bloccocos"> 
    <h1 class="bloccoscricos">
        Login	 
    </h1>
</div> 

<div id="main" class="container"> 	
    <form name="loginform" id="loginform" action="login" method="post" class="wpl-track-me"> 
        <p class="login-username">
            <label for="user_login">Username</label> 
            <input type="text" name="log" id="user_login" class="input" placeholder="Email Address" value="" size="20" /> 
        </p> 
        <p class="login-password"> 
            <label for="user_pass">Password</label><input type="password" name="pwd" id="user_pass" class="input" placeholder="Password" value="" size="20" /> 
        </p> 	
        <p class="login-remember"><label><input name="rememberme" type="checkbox" id="rememberme" value="forever"> Remember Me</label></p>
        <p class="login-submit"><input type="submit" name="wp-submit" id="wp-submit" class="button-primary" value="Accedi" />
            Non hai un account?<a href="registrazione.jsp">Registrati</a>
            <input type="hidden" name="redirect_to" value="#"/>
        </p> 	
    </form> 
</div>

<%@ include file="footer.jsp" %>
</body>
</html>	
