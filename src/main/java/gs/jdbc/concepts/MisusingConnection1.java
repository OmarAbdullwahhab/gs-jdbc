package gs.jdbc.concepts;

import gs.jdbc.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class MisusingConnection1 {

    public static void main(String[] args) throws SQLException, InterruptedException {
        //Connection..                                          "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";
        var cl = new ArrayList<Connection>();
        for(int i = 0; i < 500; i++) {
            try {
                var c1 = DriverManager.getConnection(Main.TCP_URL, "sa", "123");
                cl.add(c1);
            }catch (Exception ex){
                System.out.println("Ex: " +ex.getMessage());
            }
        }
        var closed = 0;
        for(var c : cl){
            if(c.isClosed()){
                System.out.println("Connection is closed ");
                closed++;
            }
        }
        var total = cl.size();
        System.out.println("connections created " + (total - closed));
        System.out.println("Closed connection " + closed);
        Thread.currentThread().join();

    }
}
