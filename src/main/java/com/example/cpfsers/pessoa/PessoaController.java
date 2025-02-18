package com.example.cpfsers.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    public PessoaService pessoaService;

    @PostMapping()
    public PessoaDTO save(PessoaDTO pessoaDTO) {
        return pessoaService.save(pessoaDTO);
    }

    @GetMapping("/listar")
    public List<PessoaDTO> findAll() {
        return pessoaService.findAll();
    }
}
