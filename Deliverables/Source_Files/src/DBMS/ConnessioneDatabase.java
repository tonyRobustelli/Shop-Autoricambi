package DBMS;

import java.sql.*;
import java.lang.ClassNotFoundException;

/**
 * Classe che si occupa della creazione della connessione per il database
 */
public class ConnessioneDatabase {

    /**
     * Crea una connessione per il database
     * @return restituisce un oggetto Connection
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");//carico il driver
	
	//stabilisco la connessione stabilendo username e password
	Connection conn = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/shop_autoricambi","root","gerardo" ) ;

	
	return conn;
}
}