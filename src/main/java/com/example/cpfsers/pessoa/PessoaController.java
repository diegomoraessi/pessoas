package com.example.cpfsers.pessoa;

import java.util.List;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PessoaController {

    @Autowired
    public PessoaService pessoaService;

    @PostMapping("/salvar")
    public String save(Pessoa pessoa, Model model) {

        pessoaService.save(new PessoaDTO(pessoa.getNome(), pessoa.getCpf(), pessoa.getIdade(), pessoa.getId()));
        return "redirect:/pessoa/listar";
    }

    @GetMapping("/listar")
    public List<PessoaDTO> findAll() {
        return pessoaService.findAll();
    }
}
