package br.com.dio.desafio.dominio;

public class DesafioDeCodigo extends Avaliacao {

    public DesafioDeCodigo(Curso curso) {
        super(curso);
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO+30d;
    }


}
