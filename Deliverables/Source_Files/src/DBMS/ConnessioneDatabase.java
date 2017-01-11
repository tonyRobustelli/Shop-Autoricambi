package DBMS;

import java.sql.*;
import java.lang.ClassNotFoundException;


public class ConnessioneDatabase {

    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");//carico il driver
	
	//stabilisco la connessione stabilendo username e password
	Connection conn = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/shop_autoricambi","root","gerardo" ) ;

	
	return conn;
}
}