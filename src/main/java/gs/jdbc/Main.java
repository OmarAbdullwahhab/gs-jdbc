package gs.jdbc;

import gs.jdbc.utils.H2DatabaseServerUtil;
import gs.jdbc.utils.H2WebUtil;

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
