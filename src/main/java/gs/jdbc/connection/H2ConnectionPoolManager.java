package gs.jdbc.connection;

import gs.jdbc.Main;
import org.h2.jdbcx.JdbcConnectionPool;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class H2ConnectionPoolManager implements ConnectionPoolManager{

    private final JdbcDataSource ds;
    private final JdbcConnectionPool pool;

    public H2ConnectionPoolManager() {
        ds = new JdbcDataSource();
        ds.setURL(Main.TCP_URL);
        ds.setUser("sa");
        ds.setPassword("123");

        pool = JdbcConnectionPool.create(ds);
        pool.setMaxConnections(5);
        pool.setLoginTimeout(2);

    }

    public Connection getConnection() throws SQLException {
        return this.pool.getConnection();
    }
}
