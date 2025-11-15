package gs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Driver..
//impl jdbc api...
public class Main {

    public static final String LOCAL_URL = "jdbc:h2:./gs-jdbc";
    public static final String TCP_URL = "jdbc:h2:tcp://127.0.0.1:9092/./gs-jdbc";

    public static void main(String[] args) throws Exception {

        H2DatabaseServerUtil.startDatabaseServer();
        H2WebUtil utils = new H2WebUtil();
        utils.startWebConsole();


    }
}
