package gs.jdbc.utils;

import org.h2.tools.Server;

import java.sql.SQLException;

public class H2WebUtil {


    private Server webConsoleServer;

    public void startWebConsole() throws SQLException {
        this.webConsoleServer = Server.createWebServer("-webPort","8082","-tcpAllowOthers", "-webAllowOthers").start();

        System.out.println("Web console start : http://localhost:8082");
    }

    public void stopWebConsole(){
        if(this.webConsoleServer != null){
            this.webConsoleServer.stop();
        }
    }

    public static void main(String[] args) throws SQLException {
        H2WebUtil console = new H2WebUtil();
        console.startWebConsole();
    }
}
