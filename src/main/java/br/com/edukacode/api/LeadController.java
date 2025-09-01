package br.com.edukacode.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lead")
public class LeadController {
    @Autowired //injeção de dependência
    private LeadRepository repository;
    @PostMapping
    public String criarLead(@RequestBody DadosCadastroLead dados) {
        //Implementação do método para criar um lead
        System.out.println("Lead criado com os dados: " + dados);
        //null - persitence
        //sem null - 
        repository.save(new Lead(null,dados.nome(),dados.email(),dados.telefone()));
        return "Lead criado com sucesso!"; 

    }
    @GetMapping
    public void ListarLeads(){
        //Implementeção do método para listar todos os leads

    }
    @PutMapping
    public void atualizarlead(){

    }
    @DeleteMapping
    public void excluirLead(){

    }

}
