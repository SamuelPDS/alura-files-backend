package br.com.alura.screenmatch.models.Titulo;

import br.com.alura.screenmatch.calculos.Classificable;

public class Serie extends Titulo implements Classificable {
    private int temporadas;
    private int epsPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(){}

    public Serie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsPorTemporada() {
        return epsPorTemporada;
    }

    public void setEpsPorTemporada(int epsPorTemporada) {
        this.epsPorTemporada = epsPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public double getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuration_minutes() {
        return minutosPorEpisodio * epsPorTemporada * temporadas;
    }

    @Override
    public int getClassification() {
        return getTotalRates()/2;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome=" + getName() +
                "temporadas=" + temporadas +
                ", epsPorTemporada=" +
                ", minutosPorEpisodio=" + minutosPorEpisodio +
                '}';
    }
}
