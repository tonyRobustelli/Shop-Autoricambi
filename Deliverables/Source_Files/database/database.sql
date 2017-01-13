drop database if exists shop_autoricambi;
create database shop_autoricambi;
use shop_autoricambi;

Create table Utente
(
  cf char(16) NOT NULL,
  nome char(40) NOT NULL,
  cognome char(40) NOT NULL,
  data_nascita varchar(15) NOT NULL,
  telefono char(10) NOT NULL,
  cellulare char(10) NOT NULL,
  email varchar(40) NOT NULL,
  passw varchar(40) NOT NULL,
  via varchar(40) NOT NULL,
  cap char(5) NOT NULL,
  citta varchar(40) NOT NULL,
  amministratore boolean default 0, 
  unique(email),
  primary key(cf)
);

create table Fattura
(
	codice_fattura int auto_increment,
	dataF varchar(50),
    costo_totale float,
    pagamento varchar(30) NOT NULL default 'consegna',
    cliente char(16) NOT NULL,
    primary key(codice_fattura),
    foreign key(cliente) references utente(cf) on delete no action on update no action
);

Create table Prodotto
(
	cod_pezzo varchar(20) NOT NULL,
	marchio varchar(30) NOT NULL,
	modello varchar(30) NOT NULL,
	prezzo float(2) NOT NULL,
	offerta boolean default 0,
	prezzo_scontato float(2),
	descrizione longtext NOT NULL,
	quantita int NOT NULL default 0,
    primary key(cod_pezzo)
);

create table Acquisto 
(
   codice_acquisto int auto_increment,
   descrizione longtext not null,
   quantita int not null,
   fattura int not null,
   prodotto varchar(20),
   primary key (codice_acquisto),
   foreign key (fattura) references Fattura(codice_fattura) on delete no action on update no action,
   foreign key (prodotto) references Prodotto(cod_pezzo) on delete no action on update no action
);

create table Foto
(
	num_foto int auto_increment NOT NULL,
    path longtext NOT NULL,
    prodotto varchar(20),
    primary key(num_foto),
    foreign key (prodotto) references Prodotto(cod_pezzo) on delete no action on update no action
);

INSERT INTO `shop_autoricambi`.`utente` (`cf`, `nome`, `cognome`, `data_nascita`, `telefono`, `cellulare`, `email`, `passw`, `via`, `cap`, `citta`, `amministratore`) VALUES ('0000000000000001', 'Tommaso', 'Esposito', '05/11/1995', '0818880011', '3335554478', 'prova@gmail.com', 'prova', 'corso', '80000', 'Fisciano', '0');
INSERT INTO `shop_autoricambi`.`utente` (`cf`, `nome`, `cognome`, `data_nascita`, `telefono`, `cellulare`, `email`, `passw`, `via`, `cap`, `citta`, `amministratore`) VALUES ('0000000000000002', 'Luca', 'Finelli', '23/01/1993', '0818880011', '3335554478', 'admin@gmail.com', 'prova', 'corso', '80000', 'Fisciano', '1');
