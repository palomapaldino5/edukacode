package br.com.edukacode.api;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroGenero(
    @NotBlank(message = "O nome não pode ser vazio")
    String nome
) {}
