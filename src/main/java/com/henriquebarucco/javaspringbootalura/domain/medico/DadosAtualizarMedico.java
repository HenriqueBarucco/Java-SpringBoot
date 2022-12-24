package com.henriquebarucco.javaspringbootalura.domain.medico;

import com.henriquebarucco.javaspringbootalura.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
