package com.example.cpfsers.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.cpfsers.pessoa.PessoaDTO;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("pessoa", new PessoaDTO());
        return "index";
    }

}
