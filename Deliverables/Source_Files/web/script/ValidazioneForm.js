/**********************Validazione Form inserimento partner****************************************/  
 
 function ControllaPartner()
 {
	 var iva = document.forms["inspartner"]["p_iva"].value;
	 var via= document.forms["inspartner"]["via"].value;
	 var citta= document.forms["inspartner"]["citta"].value;
	 var cap= document.forms["inspartner"]["cap"].value;
	 var tele= document.forms["inspartner"]["telefono"].value;
	 var emoff= document.forms["inspartner"]["email_offi"].value;
	 var email_reg_exp = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-]{2,})+\.)+([a-zA-Z0-9]{2,})+$/;  //espressione regolare per validare email
	 
	    
	   /*****Controlli sulla validità della partita iva*****/
	 
	   if (iva == null || iva == "" ) {
	        alert("Il campo partita iva e' obbligatorio");
	        document.inspartner.p_iva.focus();
	        return false;
	    }
	    else if(iva.length<11 || iva.length>11 || isNaN(iva))
	    {
	        alert("La partita iva inserita non e' corretta");
	        document.inspartner.p_iva.value = "";
	        document.inspartner.p_iva.focus();
	        return false;
	    }
	    
	    
	    
	    
	    /*****Controlli sulla validità della via*****/
	     if(via==null || via=="")
	    {
	        alert("Il campo  via e' obbligatorio");
	        document.inspartner.via.focus();
	        return false;
	    }
	    
	    
	    /*****Controlli sulla validità del cap*****/
	    else if(cap==null || cap=="")
	    {
	        alert("Il campo cap e' obbligatorio");
	        document.inspartner.cap.focus();
	        return false;
	    }
	    
	     
	    else if(cap.length<5 || cap.length>5 || isNaN(cap))
	    {
	        alert("Il cap inserito non e' corretto,è un dato numerico");
	        document.inspartner.cap.value = "";
	        document.inspartner.cap.focus();
	        return false;
	    }
	     
	     /*****Controlli sulla validità del città*****/
	    else if(citta==null || citta=="")
	    {
	        alert("Il campo citta' e' obbligatorio");
	        document.inspartner.citta.focus();
	        return false;
	    }
	    
	   
	    
	   
	    
	    /*****Controlli sulla validità del telefono*****/
	    else if ((tele == "") || (tele == null)) {
	    	   alert("Il campo telefono e' obbligatorio.");
	    	   document.inspartner.tele.focus();
	    	   return false;
	    	}
	    
	    else if(isNaN(tele) || tele.length<7)
	    {
	        alert("Il telefono inserito non e' corretto,e' un dato numerico");
	        document.inspartner.telefono.value = "";
	        document.inspartner.telefono.focus();
	        return false;
	    }
	    
	    
	    
	    /*****Controlli sulla validità della mail*****/
	    else if (!email_reg_exp.test(emoff) || (emoff == "") || (emoff == null)) {
	       alert("Inserire un indirizzo email corretto.");
	       document.inspartner.email_offi.select();
	       return false;
	    }
 }    
 