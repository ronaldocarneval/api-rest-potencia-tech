package potencia.tech.api.aluno;


import jakarta.validation.constraints.NotNull;


public record DadosAtualizacaoAluno(
        @NotNull
        Long id,
        String nome,
        String idade,
        String notaPrimeiroSemestre,
        String notaSegundoSemestre,
        String nomeProfessor,
        String numeroSala
        ) {
}
