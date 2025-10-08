package model;

import util.Endereco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<Turma> turmas;
    private Disciplina disciplina;

    public Professor(String nome, Endereco endereco, LocalDate dataDeNascimento, double salario, Disciplina disciplina) {
        super(nome, endereco, dataDeNascimento, new Cargo("Professor", "Responsável por ensinar as disciplinas"), salario);
        this.disciplina = disciplina;
        this.turmas = new ArrayList<>();
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void removerTurma(Turma turma) {
        this.turmas.remove(turma);
    }
}
