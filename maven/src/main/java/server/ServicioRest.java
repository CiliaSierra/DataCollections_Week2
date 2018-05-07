package server;


import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orders")
@Singleton //Lo necesitamos para decirle a jerser que use una unica instancia

public class ServicioRest {

    //Testing purposes "/Hello"
    @GET
    @Path("/Hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }


}
