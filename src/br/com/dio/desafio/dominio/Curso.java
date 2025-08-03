package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cagarHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cagarHoraria;
    }
    public Curso() {
    }


    public int getCagarHoraria() {
        return cagarHoraria;
    }

    public void setCagarHoraria(int cagarHoraria) {
        this.cagarHoraria = cagarHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cagarHoraria=" + cagarHoraria +
                '}';
    }


}
