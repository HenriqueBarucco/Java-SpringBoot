package com.henriquebarucco.javaspringbootalura.paciente;

import com.henriquebarucco.javaspringbootalura.endereco.DadosEndereco;
import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
