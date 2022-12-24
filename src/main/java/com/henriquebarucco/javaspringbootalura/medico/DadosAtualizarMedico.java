package com.henriquebarucco.javaspringbootalura.medico;

import com.henriquebarucco.javaspringbootalura.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
