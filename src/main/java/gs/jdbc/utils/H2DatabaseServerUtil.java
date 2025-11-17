package gs.jdbc.utils;

import org.h2.tools.Server;


public class H2DatabaseServerUtil {


    private static final int    TCP_PORT = 9092;

    public static void startDatabaseServer() throws Exception {

        // 1. Start the TCP server (so other processes can connect)
        Server tcpServer = Server.createTcpServer(
                "-tcpPort", String.valueOf(TCP_PORT),
                "-tcpAllowOthers",
                "-ifNotExists", //non secure
                "-tcpPassword", "secret"    // optional: password protection
        ).start();

        System.out.println("H2 TCP server started on port " + TCP_PORT);
        System.out.println("URL for remote clients: jdbc:h2:tcp://localhost:" + TCP_PORT + "/gs-jdbc");

        // Keep the JVM alive so the server stays up (press Ctrl+C to stop)
        System.out.println("\nServer is running. Press Ctrl+C to stop.");
    }

    public static void main(String[] args) throws Exception {
        startDatabaseServer();

    }

}