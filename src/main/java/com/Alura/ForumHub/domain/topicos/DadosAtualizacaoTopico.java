package com.Alura.ForumHub.domain.topicos;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem

) {
}
