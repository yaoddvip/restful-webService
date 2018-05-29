package com.mr.service;

import com.mr.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * Created by ydd on 2018/5/29.
 */
@Path("hello")//访问的路径： ip:端口/rest/hello/方法的path
public class HelloService {



    /**
     * get方法接受参数
     */
    @GET //使用get方法访问
    @Path("hello/{id}")
    public void test2(@PathParam("id") Integer id){
        System.out.println("接受到的参数为：" + id);
    }

    /**
     * 通过id查询对象，返回对象信息
     */
    @GET //使用get方法访问
    @Path("get/{id}")
    @Produces(MediaType.APPLICATION_JSON)//指定返回参数的类型 APPLICATION_JSON：json
    public User test3(@PathParam("id") Integer id){
        System.out.println("接受到的参数为：" + id);
        //通过id查询数据库
        User user = new User(id,"zs",18);
        return user;
    }

    @GET //使用get方法访问
    @Path("hello")//访问的路径： ip:端口/rest/hello/hello
    public void test1(){
        System.out.println("hello GET restFul webService .. ");
    }

    @POST//表示是post访问
    @Path("/hello")
    public void test4(@QueryParam("name") String name){
        System.out.println(name);
        System.out.println("hello POST ....");
    }


    @POST//表示是post访问
    @Path("/helloUser")
    @Consumes(MediaType.APPLICATION_JSON)//传入参数的类型为json
    @Produces(MediaType.APPLICATION_JSON)//返回参数的类型为json
    public User test7(User user){
        System.out.println(user);
        System.out.println("hello POST ....");
        return user;
    }

    @DELETE//表示是post访问
    @Path("/hello")
    public void test5(){
        System.out.println("hello DELETE ....");
    }

    @PUT//表示是post访问
    @Path("/hello")
    public void test6(){
        System.out.println("hello PUT ....");
    }
}
