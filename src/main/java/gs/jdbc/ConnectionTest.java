package gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    //design pattern ( singleton ) ( object1, obj )
    //Connection Pools ( 5-10 connection / ready  )  100 - 1000.
    public static void main(String[] args) throws SQLException, InterruptedException {
        //Connection..                                          "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";
        Connection connection = DriverManager.getConnection(Main.TCP_URL,"sa","123");
        System.out.println("Connection to h2 done....");
        //Statement stmt = connection.createStatement();
        //var createTableSQL = "create table test3( id integer primary key, name varchar(30));";
        //stmt.executeUpdate(createTableSQL);
        //150 --> connection1
        //
        //stmt.close();
        //connection.close();
        Thread.currentThread().join();

    }
}
