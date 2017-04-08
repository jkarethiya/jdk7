/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.jdk.j2se.core.object;

/**
 *
 * @author ic034480
 */
abstract class Server {
    protected String serverName;
    protected long startTime;
    protected long stopTime;

    Server() {}

    Server(String serverName) {
        this.serverName = serverName;
    }

    public void startServer() {
        this.startTime = System.currentTimeMillis();
        System.out.println(serverName + " server started at " + startTime);
    }

    public void stopServer() {
        this.stopTime = System.currentTimeMillis();
        System.out.println(serverName + " server stopped at " + stopTime);
    }

    public abstract void processRequest();
}

class Tomcat extends Server {
    
    public Tomcat(String serverNae) {
        super(serverNae);
    }

    public void processRequest() {
        for(int i = 0; i < 999999; i++ )
            for(int j = 0; j < 999999; j++ );
    }

}

public class ChainedConstructorTest {
    public static void main(String[] args) {
        Server server = new Tomcat(Tomcat.class.getSimpleName());
        server.startServer();
        server.processRequest();
        server.stopServer();
    }
}
