package gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton
public class ConnectionManager {

    private final Connection connection;

    private ConnectionManager(){
        try {
            this.connection = DriverManager.getConnection(Main.TCP_URL,"sa","123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static volatile ConnectionManager INSTANCE;

    public static ConnectionManager getInstance(){
        if(INSTANCE == null){
            synchronized (ConnectionManager.class) { //old
                INSTANCE = new ConnectionManager();
            }
        }
        return INSTANCE;
    }


    public Connection getConnection(){
        return this.connection;
    }


}
