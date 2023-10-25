package potencia.tech.api.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosListagemAlunos(
        Long id,
        String nome,
        String idade,
        String notaPrimeiroSemestre,
        String notaSegundoSemestre,
        String nomeProfessor,
        String numeroSala
) {
    public DadosListagemAlunos(Aluno aluno) {
        this(aluno.getId(),aluno.getNome(), aluno.getIdade(), aluno.getNotaPrimeiroSemestre(), aluno.getNotaSegundoSemestre(), aluno.getNomeProfessor(),aluno.getNumeroSala());
    }
}
