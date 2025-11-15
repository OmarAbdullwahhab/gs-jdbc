package gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Driver..
//impl jdbc api...
public class Main {

    public static final String LOCAL_URL = "jdbc:h2:./gs-jdbc";
    public static final String TCP_URL = "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";

    public static void main(String[] args) throws SQLException {
        //Connection..                                          "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";
        Connection connection = DriverManager.getConnection(LOCAL_URL,"sa","123");
        System.out.println("Connection to h2 done....");


        //h2-console.

        //Client Server --> oracle/micorsoft/mysql/mariadb/db2/ (sybase). --> tcp
        //Embedded Database.. (file ) // user--> pc1, user-->pc1.

        //SQL Server MS. --> SQL Developer --> Workbench MYSQL
    }
}
