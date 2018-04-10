package it.salvo.example;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;

/**
 * Created by Salvatore on 10/04/2018.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/space")
public class SpaceREST {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getSpace() {
        // Return some cliched textual content
        return "space";
    }

    @DELETE
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String deleteSpace() {
        // Return some cliched textual content
        return "Clean space";
    }


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
