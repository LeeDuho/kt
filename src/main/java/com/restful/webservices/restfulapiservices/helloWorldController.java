package com.restful.webservices.restfulapiservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping(path = "/hello-world")
    public String  helloWorld() {
        return "hello world";
    }
}
