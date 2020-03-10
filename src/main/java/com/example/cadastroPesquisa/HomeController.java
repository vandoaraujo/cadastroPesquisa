package com.example.cadastroPesquisa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
 
  @GetMapping("/login")
  public String login() {
    return "login"; // <<< Retorna a página de login
  }
   
  @GetMapping("/")
  public String index() {
    return "inicio";
  }
}
