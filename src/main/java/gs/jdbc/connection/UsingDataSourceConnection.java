package gs.jdbc.connection;

import java.sql.SQLException;

public class UsingDataSourceConnection {

    public static void main(String[] args) throws SQLException, InterruptedException {
        //Connection..                                          "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";
        DataSourceConnectionManager dscm = new DataSourceConnectionManager();
        for (int i = 0; i < 30; i++) {
            try {
                var c1 = dscm.getConnection();
            } catch (Exception ex) {
                System.out.println("Ex: " + ex.getMessage());
            }
        }
        Thread.currentThread().join();
    }
}
