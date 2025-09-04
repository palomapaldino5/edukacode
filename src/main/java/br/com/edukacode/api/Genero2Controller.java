package br.com.edukacode.api;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generos")
public class Genero2Controller {

    @Autowired
    private Genero2Repository repository;

    // Endpoint de cadastrar
    @PostMapping
    public Genero2 cadastrar(@RequestBody @Valid DadosCadastroGenero dados) {
        Genero2 genero2 = new Genero2(null, dados.nome());
        return repository.save(genero2);
    }

    // Endpoint de listar com paginação
    @GetMapping
    public Page<Genero2> listar(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
