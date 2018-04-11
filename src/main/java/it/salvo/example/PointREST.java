package it.salvo.example;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

/**
 * Created by Salvatore on 10/04/2018.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/point")
public class PointREST {

    @POST
    @Produces("text/plain")
    public String getClichedMessage() {
        return "Insert point";
    }

/*    @POST
    @Path("/{param}")
    @Produces("text/plain")
    public String getClichedMessage(@PathParam("param") String coordinate) {
        return "Insert point: "+coordinate;
    }*/

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();
        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/helloworld");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
