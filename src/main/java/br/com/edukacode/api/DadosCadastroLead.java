package br.com.edukacode.api;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroLead(
    @NotBlank
    String nome,

    @NotBlank
    String email,

    @NotBlank
    String telefone,

   @NotBlank
   String cpf
){}