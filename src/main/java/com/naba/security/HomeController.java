package com.naba.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return ("<h1> Welcome to Spring Security !! </h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1> Welcome to Spring Security User !! </h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1> Welcome to Spring Security Admin !! </h1>");
    }
}
