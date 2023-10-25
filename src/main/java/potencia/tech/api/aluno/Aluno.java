package potencia.tech.api.aluno;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "aluno")
@Entity(name="Aluno")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")
public class Aluno {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;
    private String notaPrimeiroSemestre;
    private String notaSegundoSemestre;
    private String nomeProfessor;
    private String numeroSala;

    public Aluno(DadosCadastroAluno dados) {
        this.nome = dados.nome();
        this.idade = dados.idade();
        this.notaPrimeiroSemestre = dados.notaPrimeiroSemestre();
        this.notaSegundoSemestre = dados.notaSegundoSemestre();
        this.nomeProfessor = dados.nomeProfessor();
        this.numeroSala = dados.numeroSala();
    }

    public void atualizarInformacoes(DadosAtualizacaoAluno dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.idade() != null) {
            this.idade = dados.idade();
        }
        if (dados.notaPrimeiroSemestre() != null) {
            this.notaPrimeiroSemestre = dados.notaPrimeiroSemestre();
        }
        if (dados.notaSegundoSemestre() != null) {
            this.notaSegundoSemestre = dados.notaSegundoSemestre();
        }
        if (dados.nomeProfessor() != null) {
            this.nomeProfessor = dados.nomeProfessor();
        }
        if (dados.numeroSala() != null) {
            this.numeroSala = dados.numeroSala();
        }
    }
}
