package gs.jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionPoolManager {

    public Connection getConnection() throws SQLException;
}
