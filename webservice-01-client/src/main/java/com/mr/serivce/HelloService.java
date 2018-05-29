package com.mr.serivce;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by ydd on 2018/5/29.
 */
@Path("/hello")
public class HelloService {


    @GET
    @Path("/test1")
    @Produces(MediaType.APPLICATION_JSON)
    public User test1(){
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setName("zs");
        return user;
    }


    @POST
    @Path("/test1")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    //public void test2( @QueryParam("name") String name ){
    public User test2(User user){
        System.out.println(user);
        System.out.println("hello POST restFul webService");
        return user;
    }

    @DELETE
    @Path("/test1")
    public void test3(){
        System.out.println("hello DELETE restFul webService");
    }

}
