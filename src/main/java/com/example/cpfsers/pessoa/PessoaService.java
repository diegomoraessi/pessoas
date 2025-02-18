package com.example.cpfsers.pessoa;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    public IPessoaRespository pessoaRepository;

    public PessoaDTO save(PessoaDTO pessoaDTO) {
        Pessoa pessoa = new Pessoa(pessoaDTO.getNome(), pessoaDTO.getCpf(), pessoaDTO.getIdade(), pessoaDTO.getId());
        pessoa = pessoaRepository.save(pessoa);
        return new PessoaDTO(pessoa.getNome(), pessoa.getCpf(), pessoa.getIdade(), pessoa.getId());

    }

    public List<PessoaDTO> findAll() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return pessoas.stream().map(pessoa -> new PessoaDTO(pessoa.getNome(), pessoa.getCpf(), pessoa.getIdade(), pessoa.getId())).collect(Collectors.toList());
    }
}
