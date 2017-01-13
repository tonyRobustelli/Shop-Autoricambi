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
	 
	
 
 
 
       /*************************Controlli form registrazione Cliente****************/
	    function ControllaCliente()
	    {
	    	var nome=document.regcli.nome.value;
	    	var cog=document.regcli.cognome.value;
	    	var codfi=document.regcli.codicefiscale.value;
	    	var datna=document.regcli.datanascita.value;
	    	var tel=document.regcli.telefono.value;
	    	var cell=document.regcli.cellulare.value;
	    	var via=document.forms["regcli"]["via"].value;
	    	var cap=document.regcli.cap.value;
	    	var citta=document.regcli.citta.value;
	    	var emai=document.regcli.email.value;
	    	var pass=document.regcli.psw.value;
	    	var copass=document.regcli.pswconf.value;
	    	var pattern = /^[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]$/; ///Controllo validità codice fiscale
	    	var email_reg_exp = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-]{2,})+\.)+([a-zA-Z0-9]{2,})+$/;  //espressione regolare per validare email
	    	
	    	  /***Controllo validità campo nome***/
	    	if(nome==null || nome=="")
	  	    {
	  	        alert("Il campo nome e' obbligatorio"+via);
	  	        document.regcli.nome.focus();
	  	        return false;
	  	    }
	    	
	    	
	    	  /***Controllo validità campo cognome***/
	    	else if(cog==null || cog=="")
	  	    {
	  	        alert("Il campo cognome e' obbligatorio");
	  	        document.regcli.cognome.focus();
	  	        return false;
	  	    }
	    	
	    	
	    	/***Controllo validità campo codice fiscale***/
	    	else if(codfi==null || codfi=="")
	  	    {
	  	        alert("Il campo codice fiscale e' obbligatorio");
	  	        document.regcli.codicefiscale.focus();
	  	        return false;
	  	    }
	    	
	    	else if(codfi.search(pattern) == -1)
	    	  {
	    	    // In caso di errore stampo un avviso e pulisco il campo...
	    	    alert("Il valore inserito non e' un codice fiscale!");
	    	    document.regcli.codicefiscale.value = "";
	    	    document.regcli.codicefiscale.focus();
	    	    return false;
	    	  }
	    	
	    	/***Controllo validità campo data di nascita**/
	    	else if(datna==null || datna=="")
	  	    {
	  	        alert("Il campo data di nascita e' obbligatorio");
	  	        document.regcli.datanascita.focus();
	  	        return false;
	  	    }
	    	
	    	else if (document.regcli.datanascita.value.substring(2,3) != "/" ||
	                document.regcli.datanascita.value.substring(5,6) != "/" ||
	                isNaN(document.regcli.datanascita.value.substring(0,2)) ||
	                isNaN(document.regcli.datanascita.value.substring(3,5)) ||
	                isNaN(document.regcli.datanascita.value.substring(6,10))) {
	            
	           alert("Inserire una data di nascita in formato gg/mm/aaaa");
	           document.regcli.datanascita.value = "";
	           document.regcli.datanascita.focus();
	           return false;
	       }
	      
	    	else if (document.regcli.datanascita.value.substring(0,2) > 31) {
	           alert("Impossibile utilizzare un valore superiore a 31 per i giorni");
	           document.regcli.datanascita.select();
	           return false;
	       }
	    	
	    	else if (document.regcli.datanascita.value.substring(0,2) < 1) {
		           alert("Impossibile utilizzare un valore inferiore a 1 per i giorni");
		           document.regcli.datanascita.select();
		           return false;
		       }
	    	
	       else if (document.regcli.datanascita.value.substring(3,5) > 12) {
	           alert("Impossibile utilizzare un valore superiore a 12 per i mesi");
	           document.regcli.datanascita.value = "";
	           document.regcli.datanascita.focus();
	           return false;
	       }
	    	
	       else if (document.regcli.datanascita.value.substring(3,5) < 1) {
	           alert("Impossibile utilizzare un valore inferiore a 1 per i mesi");
	           document.regcli.datanascita.value = "";
	           document.regcli.datanascita.focus();
	           return false;
	       }
	    	
	       else if (document.regcli.datanascita.value.substring(6,10) < 1900) {
	           alert("Impossibile utilizzare un valore inferiore a 1900 per l'anno");
	           document.regcli.datanascita.value = "";
	           document.regcli.datanascita.focus();
	           return false;
	       }
	    	
	    	/*****Controlli sulla validità del telefono*****/
		    
		    if(tel!=null || tel!="")
		    {	
		    	if(isNaN(tel) || tel.length<7)
		        {
		         alert("Il numero di telefono inserito non e' corretto,e' un dato numerico");
		         document.regcli.telefono.value = "";
		         document.regcli.telefono.focus();
		         return false;
		        }
		    } 	
		    	
	    	
	    	/*****Controlli sulla validità del cellulare*****/
		    else if (cell == "" || cell == null) {
		    	   alert("Il campo cellulare e' obbligatorio.");
		    	   document.regcli.cellulare.focus();
		    	   return false;
		    	}
		    
		    else if(isNaN(cell) || cell.length<7)
		    {
		        alert("Il numero di cellulare inserito non e' corretto,e' un dato numerico");
		        document.regcli.cellulare.value = "";
		        document.regcli.cellulare.focus();
		        return false;
		    }
	    	
	    	/*****Controlli sulla validità della via*****/
		     if(via==null || via=="")
		    {
		        alert("Il campo  via e' obbligatorio");
		        document.regcli.via.focus();
		        return false;
		    }
		    
		    
		    /*****Controlli sulla validità del cap*****/
		    else if(cap==null || cap=="")
		    {
		        alert("Il campo cap e' obbligatorio");
		        document.regcli.cap.focus();
		        return false;
		    }
		    
		    else if(cap.length<5 || cap.length>5 || isNaN(cap))
		    {
		        alert("Il cap inserito non e' corretto,e' un dato numerico");
		        document.regcli.cap.value = "";
		        document.regcli.cap.focus();
		        return false;
		    }
	    	
	    	/*****Controlli sulla validità del città*****/
		    else if(citta==null || citta=="")
		    {
		        alert("Il campo citta' e' obbligatorio");
		        document.regcli.citta.focus();
		        return false;
		    }
	    	
	    	/*****Controlli sulla validità della mail*****/
		    else if (!email_reg_exp.test(emai) || (emai == "") || (emai == null)) {
		       alert("Inserire un indirizzo email corretto.");
		       document.regcli.email.select();
		       return false;
		    }
	    	
	    	/*****Controlli sulla validità della password*****/
		    else if(pass=="" || pass==null)
		    {
		     alert("Il campo password e' obbligatorio");
		     document.regcli.psw.focus();
		     return false;
		    }
	    	
		    else if(pass.length<8 || pass.substring(0,1)<"A" || pass.substring(0,1)>"Z" || isNaN(pass.substring(pass.length-1,pass.length) )) //Ci deve essere una lettera maiuscola all'inizio ed un numero alla fine
		    {
			     alert("Password inserita non rispetta i requisiti di sicurezza"+pass.length);
			     document.regcli.psw.value = "";
			     document.regcli.psw.focus();
			     return false;
			}
	    
	    /*****Controlli sulla validità della conferma password*****/
	    else if(copass=="" || copass==null  || pass!=copass)
	    {
	     alert("Riconferma la password");
	     document.regcli.pswconf.value="";
	     document.regcli.pswconf.focus();
	     return false;
	    }
     }    	
    	
/**********************Validazione form inserimento prodotto amministratore*****************************/
		     
		     function ControllaProdotti()
			    {
			    	var codp=document.regp.cod_pezz.value;
			    	var mar=document.regp.marchio.value;
			    	var mode=document.regp.modello.value;
			    	var pre=document.regp.prezzo.value;
			    	var prescont=document.regp.prescont.value;
			    	var desc=document.regp.descri.value;
			    	var qua=document.regp.quanti.value;
			    
			    	alert("Sono entrato nei controlli");
			    	
			    	/*****Controllo campo  codice pezzo*****/
			    	if (codp == null || codp == "" ) {
				        alert("Il campo codice del pezzo e' obbligatorio");
				        document.regp.cod_pezz.focus();
				        return false;
				    }
			    	
			    	/*****Controllo campo  marchio*****/
			    	if (mar == null || mar == "" ) {
				        alert("Il campo marchio e' obbligatorio");
				        document.regp.marchio.focus();
				        return false;
				    }
			    	
			    	/*****Controllo campo modello*****/
			    	if (mode == null || mode == "" ) {
				        alert("Il campo codice del pezzo e' obbligatorio");
				        document.regp.modello.focus();
				        return false;
				    }
			    	
			    	/*****Controllo campo prezzo*****/
			    	if (pre == null || pre == "" ) {
				        alert("Il campo prezzo e' obbligatorio");
				        document.regp.marchio.focus();
				        return false;
				    }
			    	
			    	else if(isNaN(pre))
			    	{
				        alert("Il prezzo inserito non è corretto,e' un dato numerico");
				        document.regp.prezzo.value = "";
				        document.regp.prezzo.focus();
				        return false;
				    }
			    	
			    	/*****Controllo campo prezzo scontato*****/
			    	if (document.regp.offerta.value || prescont >= pre ) {
				        alert("Il prezzo scontato non è corretto,deve essere inferiore al prezzo di partenza");
				        document.regp.prescont.focus();
				        return false;
				    }
			    	
			    	
			    	/*****Controllo campo  descrizione*****/
			    	if (desc == null || desc == "" ) {
				        alert("Il campo descrizione e' obbligatorio");
				        document.regp.descri.focus();
				        return false;
				    }
			    	
			    	/*****Controllo campo quantità*****/
			    	if (qua == null || qua == "" ) {
				        alert("Il campo codice del pezzo e' obbligatorio");
				        document.regp.quanti.focus();
				        return false;
				    }
			    	
			    	else if(isNaN(qua))
			    	{
				        alert("La quantità inserita non è corretta,e' un dato numerico");
				        document.regp.quanti.value = "";
				        document.regp.quanti.focus();
				        return false;
				    }
			    	
			    	
			    	
			    	
			    	
			    	
			    }
		     
		     

		     
		     
		     
		     
/**********************Validazione quantità*****************************/

		     function ControllaQuantita()
			    {
		    	 var quanti=document.campqua.quantita.value;
		    	  
		    	    if(quanti==null || quanti=="")
		    	    	{
		    	    	 alert("Inserisci una quantita' di prodotto");
				         document.campqua.quantita.focus();
				         return false;
		    	    	}
		    	    
		    	    else if(isNaN(quanti))
			    	{
				        alert("La quantità inserita non è corretta,e' un dato numerico");
				        document.campqua.quantita.value = "";
				        document.campqua.quantita.focus();
				        return false;
				    }
		    	    	
		    	 
			    }		     
