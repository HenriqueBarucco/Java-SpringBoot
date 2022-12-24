package com.henriquebarucco.javaspringbootalura.domain.paciente;

import com.henriquebarucco.javaspringbootalura.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(
        Long id,
        String name,
        String email,
        String telefone,
        Endereco endereco
) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getEndereco());
    }
}