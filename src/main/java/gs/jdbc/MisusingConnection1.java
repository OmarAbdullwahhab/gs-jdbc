package gs.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MisusingConnection1 {

    public static void main(String[] args) throws SQLException, InterruptedException {
        //Connection..                                          "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";
        for(int i = 0; i < 500; i++) {
            try {
                var c1 = DriverManager.getConnection(Main.TCP_URL, "sa", "123");
            }catch (Exception ex){
                System.out.println("Ex: " +ex.getMessage());
            }
        }
        System.out.println("connections created ");
        Thread.currentThread().join();

    }
}
