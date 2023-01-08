package br.com.dio.desafio.dominio;

public class DesafioDeProjeto extends Avaliacao{
    public DesafioDeProjeto(Curso curso) {
        super(curso);
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO*2;
    }
}
