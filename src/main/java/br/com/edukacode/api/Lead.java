package br.com.edukacode.api;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//import jakarta.persistence.*;

@Table(name="lead")
@Entity(name="Lead")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class Lead {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    public Lead(DadosCadastroLead dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
    }

    public void setNome(String nome2) {
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

    public void setEmail(String email2) {
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }

    public void setTelefone(String telefone2) {
        throw new UnsupportedOperationException("Unimplemented method 'setTelefone'");
    }
}
