package com.henriquebarucco.javaspringbootalura.domain.consulta.validacoes.agendamento;

import com.henriquebarucco.javaspringbootalura.domain.ValidacaoException;
import com.henriquebarucco.javaspringbootalura.domain.consulta.DadosAgendamentoConsulta;
import com.henriquebarucco.javaspringbootalura.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsultas {

    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
        if (!pacienteEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com paciente excluído.");
        }
    }
}
