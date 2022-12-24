package com.henriquebarucco.javaspringbootalura.controller;

import com.henriquebarucco.javaspringbootalura.endereco.Endereco;
import com.henriquebarucco.javaspringbootalura.medico.DadosCadastroMedico;
import com.henriquebarucco.javaspringbootalura.medico.Medico;
import com.henriquebarucco.javaspringbootalura.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
}