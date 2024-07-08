package br.com.alura.screenmatch.models.Titulo;

import br.com.alura.screenmatch.calculos.Classificable;

public class Movie extends Titulo implements Classificable {
private String diretor;

    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }

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

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + getReleaseDate() + ")";
    }
}
