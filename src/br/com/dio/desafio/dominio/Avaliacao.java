package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public abstract class Avaliacao {
    private Curso curso;
    protected static final double XP_PADRAO = 40d;

    public Avaliacao(Curso curso) {
        this.curso = curso;
    }

    public abstract double CalcularXp();

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

