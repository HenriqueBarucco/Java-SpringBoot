package com.henriquebarucco.javaspringbootalura.medico;

import com.henriquebarucco.javaspringbootalura.endereco.Endereco;

public record DadosDetalhamentoMedico(
        Long id,
        String name,
        String email,
        String crm,
        String telefone,
        Especialidade especialidade,
        Endereco endereco
) {
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}