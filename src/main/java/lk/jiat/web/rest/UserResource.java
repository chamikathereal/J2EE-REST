package lk.jiat.web.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Path("/users")
public class UserResource {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") Integer id){

        Map<String, String> map = new HashMap<>();
        map.put("id", String.valueOf(id));
        map.put("name", "Chamika");
        map.put("email", "chamika@gmail.com");

        System.out.println(map);

        return Response.ok(map).build();
    }

}
