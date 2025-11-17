package gs.jdbc.connection;

import java.sql.SQLException;

public class UsingConnectionPool {

    public static void main(String[] args) throws SQLException, InterruptedException {
        //Connection..                                          "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";
        long start = System.nanoTime();
        ConnectionPoolManager dscm = new HikariConnectionPoolManager();
        for (int i = 0; i < 30; i++) {
            System.out.println("connection# " + (i+1));
            try {
                var c1 = dscm.getConnection();
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1100);
                            c1.close();
                        } catch (InterruptedException | SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
                t.start();

            } catch (Exception ex) {
                System.out.println("Ex: " + ex.getMessage());
            }
        }
        long end = System.nanoTime();
        System.out.println(" Nanos : " + (end - start));
        //H2 Nanos : 6051681937 r1
        //h2 Nanos : 5934395349 r2

        //Hikari Nanos : 6045580051 r1
        //Hikari Nanos : 6019486895 r2

        Thread.currentThread().join();
    }
}
