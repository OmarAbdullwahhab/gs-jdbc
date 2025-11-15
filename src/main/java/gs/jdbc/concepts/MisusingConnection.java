package gs.jdbc.concepts;

import gs.jdbc.Main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MisusingConnection {


    public static void main(String[] args) throws SQLException, InterruptedException {
        //Connection..                                          "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";
        var c1 = DriverManager.getConnection(Main.TCP_URL,"sa","123");
        var c2 = DriverManager.getConnection(Main.TCP_URL,"sa","123");
        var c3 = DriverManager.getConnection(Main.TCP_URL,"sa","123");
        System.out.println("Connection to h2 done....");
        //Statement stmt = connection.createStatement();
        //var createTableSQL = "create table test3( id integer primary key, name varchar(30));";
        //stmt.executeUpdate(createTableSQL);

        //
        //stmt.close();
        //connection.close();
        Thread.currentThread().join();

    }
}
