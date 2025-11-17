package gs.jdbc.connection;

import com.zaxxer.hikari.HikariDataSource;
import gs.jdbc.Main;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariConnectionPoolManager implements ConnectionPoolManager{


    private final HikariDataSource ds;

    public HikariConnectionPoolManager(){
        ds = new HikariDataSource();
        ds.setJdbcUrl(Main.TCP_URL);
        ds.setUsername("sa");
        ds.setPassword("123");
        ds.setMaximumPoolSize(5);
        try {
            ds.setLoginTimeout(2);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }


}
