package model;

import enums.Periodo;

import java.util.List;

public class Turma {
    public int codigoTurma;
    public List<Aluno> alunos;
    public List<Disciplina> disciplinas;
    public List<Professor> professores;
    public Sala salaDeAula;
    public Periodo periodo;

    public int getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(int codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public Sala getSalaDeAula() {
        return salaDeAula;
    }

    public void setSalaDeAula(Sala salaDeAula) {
        this.salaDeAula = salaDeAula;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}
