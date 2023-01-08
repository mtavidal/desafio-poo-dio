package br.com.dio.desafio.dominio;

public class Teste extends Avaliacao{

    public Teste(Curso curso) {
        super(curso);
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO+10d;
    }

}
