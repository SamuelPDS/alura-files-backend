package br.com.alura.screenmatch.models.Titulo;

import br.com.alura.screenmatch.calculos.Classificable;

public class Movie extends Titulo implements Classificable {
private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassification() {
        return (int) rateAverage()/2;
    }
}
