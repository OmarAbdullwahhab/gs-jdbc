package gs.jdbc.connection;

import gs.jdbc.Main;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceConnectionManager {


    private final JdbcDataSource ds;


    public DataSourceConnectionManager() {
        ds = new JdbcDataSource();
        ds.setURL(Main.TCP_URL);
        ds.setUser("sa");
        ds.setPassword("123");
    }

    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }
}
