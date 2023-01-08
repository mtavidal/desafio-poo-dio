package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {

    private Curso curso;

    private LocalDate dataEmissao = LocalDate.now();

    private Dev dev;

    public void emitirCertificado(){
        System.out.println("---------------------------Certificado " + this.curso.getTitulo() + "---------------------");
        System.out.println(this.curso);
        System.out.println("Emitido em: " + this.dataEmissao);
        System.out.println("Nome do Dev: " + this.dev.getNome());
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(" ");
    }

    public Certificado(Curso curso, Dev dev) {
        this.curso = curso;
        this.dev = dev;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Dev getDev() {
        return dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }
}
