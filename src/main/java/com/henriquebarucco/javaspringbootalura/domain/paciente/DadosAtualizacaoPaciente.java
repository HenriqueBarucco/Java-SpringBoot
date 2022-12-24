package com.henriquebarucco.javaspringbootalura.domain.paciente;

import com.henriquebarucco.javaspringbootalura.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
