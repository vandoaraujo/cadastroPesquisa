package com.example.cadastroPesquisa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
 
  @GetMapping("/login")
  public String login() {
    return "login";
  }
  
  @GetMapping("/home")
  public String home() {
    return "home";
  }
  
  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
   
  @GetMapping("/")
  public String index() {
    return "index";
  }
}
