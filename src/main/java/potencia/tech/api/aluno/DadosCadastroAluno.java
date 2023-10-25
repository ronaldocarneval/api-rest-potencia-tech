package potencia.tech.api.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroAluno(

        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "\\d{1,2}")
        String idade,
        @NotBlank
        @Pattern(regexp = "\\d{2,4}")
        String notaPrimeiroSemestre,
        @NotBlank
        @Pattern(regexp = "\\d{2,4}")
        String notaSegundoSemestre,
        @NotBlank
        String nomeProfessor,
        @NotBlank
        String numeroSala
) {
}
