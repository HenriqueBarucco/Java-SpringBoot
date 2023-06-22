package com.henriquebarucco.javaspringbootalura.controller;

import com.henriquebarucco.javaspringbootalura.domain.consulta.AgendaDeConsultas;
import com.henriquebarucco.javaspringbootalura.domain.consulta.DadosAgendamentoConsulta;
import com.henriquebarucco.javaspringbootalura.domain.consulta.DadosCancelamentoConsulta;
import com.henriquebarucco.javaspringbootalura.domain.consulta.DadosDetalhamentoConsulta;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultas agendaDeConsultas;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        var dto = agendaDeConsultas.agendar(dados);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity cancelar(@RequestBody @Valid DadosCancelamentoConsulta dados) {
        agendaDeConsultas.cancelar(dados);
        return ResponseEntity.noContent().build();
    }
}
