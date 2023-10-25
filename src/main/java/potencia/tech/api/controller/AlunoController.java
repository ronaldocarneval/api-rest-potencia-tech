package potencia.tech.api.controller;


import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import potencia.tech.api.aluno.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")


public class AlunoController {
    @Autowired
    private AlunoRepository repository;

    @PostMapping
    @Transactional
    @Operation(description = "Cadastra um aluno")
    public void cadastrar(@RequestBody @Valid DadosCadastroAluno dados){
        repository.save(new Aluno(dados));


    }
    @GetMapping
    @Operation(description = "Lista os alunos cadastrados em página")
    public Page<DadosListagemAlunos> listar(@PageableDefault(size=10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemAlunos::new);
    }
    @PutMapping
    @Transactional
    @Operation(description = "Atualiza dados de um aluno")
    public void atualizar(@RequestBody @Valid DadosAtualizacaoAluno dados) {
        var aluno = repository.getReferenceById(dados.id());
        aluno.atualizarInformacoes(dados);

    }
    @DeleteMapping("/{id}")
    @Transactional
    @Operation(description = "Deleta um aluno")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);

    }
}
