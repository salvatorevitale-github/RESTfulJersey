package it.salvo.example.rest;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

/**
 * Created by Salvatore on 10/04/2018.
 */
// The Java class will be hosted at the URI path "/helloworld"
@Path("/space")
public class SpaceREST {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSpace() {
        // Return some cliched textual content
        return "space";
    }

    @DELETE
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteSpace(@PathParam("param") String msg) {
        // Return some cliched textual content
        return "Clean space: "+msg;
    }


    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:9998/");
        server.start();

        System.out.println("Server running");
        System.out.println("Visit: http://localhost:9998/space/2");
        System.out.println("Hit return to stop...");
        System.in.read();
        System.out.println("Stopping server");
        server.stop(0);
        System.out.println("Server stopped");
    }
}
