package lk.jiat.web.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.util.Arrays;
import java.util.List;

@Path("/users")
public class UserResource {

    @GET
    public List<String> getUser(){
        return Arrays.asList(new String[]{"Alex","Brain","Chris"});
    }

    @GET
    @Path("/{id}")
    public String getUser(@PathParam("id") String id){
        return "User ID: " + id;
    }
}
