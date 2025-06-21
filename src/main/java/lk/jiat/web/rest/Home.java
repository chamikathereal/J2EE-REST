package lk.jiat.web.rest;

import jakarta.ws.rs.*;

@Path("/")
public class Home {

    @GET
    public String home(){
        System.out.println("Hello");
        return "Hello World";
    }

}
