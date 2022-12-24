package com.henriquebarucco.javaspringbootalura.paciente;

import com.henriquebarucco.javaspringbootalura.endereco.Endereco;

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