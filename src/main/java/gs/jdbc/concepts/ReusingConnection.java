package gs.jdbc.concepts;

import gs.jdbc.connection.ConnectionManager;

public class ReusingConnection {


    public static void main(String[] args) throws InterruptedException {
        var c1 = ConnectionManager.getInstance().getConnection();
        var c2 = ConnectionManager.getInstance().getConnection();
        var c3 = ConnectionManager.getInstance().getConnection();

        Thread.currentThread().join();
    }
}
