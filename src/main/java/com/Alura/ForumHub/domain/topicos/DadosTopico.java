package com.Alura.ForumHub.domain.topicos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record DadosTopico(
        @NotBlank @Column(unique = true) String titulo,
        @NotBlank @Column(unique = true) String mensagem,
        @NotNull LocalDateTime data_criacao,
        @NotNull EstadoTopico estado_topico,
        @NotBlank String autor,
        @NotBlank String curso
        ) {
}
