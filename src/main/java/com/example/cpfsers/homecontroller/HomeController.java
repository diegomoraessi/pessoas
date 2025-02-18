package com.example.cpfsers.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.cpfsers.pessoa.Pessoa;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Pessoa pessoa) {
        return "index";
    }

}
