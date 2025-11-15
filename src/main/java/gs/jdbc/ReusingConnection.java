package gs.jdbc;

public class ReusingConnection {


    public static void main(String[] args) throws InterruptedException {
        var c1 = ConnectionManager.getInstance().getConnection();
        var c2 = ConnectionManager.getInstance().getConnection();
        var c3 = ConnectionManager.getInstance().getConnection();

        Thread.currentThread().join();
    }
}
