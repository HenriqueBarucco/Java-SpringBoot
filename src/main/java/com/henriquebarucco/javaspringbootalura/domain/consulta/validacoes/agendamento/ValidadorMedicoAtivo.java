package com.henriquebarucco.javaspringbootalura.domain.consulta.validacoes.agendamento;

import com.henriquebarucco.javaspringbootalura.domain.ValidacaoException;
import com.henriquebarucco.javaspringbootalura.domain.consulta.DadosAgendamentoConsulta;
import com.henriquebarucco.javaspringbootalura.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsultas {

    @Autowired
    private MedicoRepository  repository;

    public void validar(DadosAgendamentoConsulta dados) {
        if (dados.idMedico() == null) {
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if (!medicoEstaAtivo) {
            throw new ValidacaoException("Consulta não pode ser agendada com médico excluído.");
        }
    }
}
