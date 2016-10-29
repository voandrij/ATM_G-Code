package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Zimme on 29-Oct-16.
 */
public class DatabaseConnector {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://mysql3.gear.host:3306/atmsimulator";

    //  Database credentials
    static final String USER = "atmsimulator";
    static final String PASS = "Dx8s5liv~h~b";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //Register JDBC driver
        Class.forName(JDBC_DRIVER);
        //Open a connection
        return DriverManager.getConnection(DB_URL,USER,PASS);
    }

}
