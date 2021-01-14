package com.dayang.rest.basic.auth;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {
    // GET
    // URL - /hello-world

    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    // @GetMapping(path = "/hello-world")
    // public String helloWorld(){
    // return "Hello World 李大洋";
    // }

    // hello-world-bean
    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean() {
        return new AuthenticationBean("You are authenticated!");
    }

    // hello-world/path-variable/dayang
    // @GetMapping(path = "/hello-world/path-variable/{name}")
    // public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
    //     // throw new RuntimeException("Something went wrong");
    //     return new HelloWorldBean(String.format("Hello World, %s", name));
    // }
}