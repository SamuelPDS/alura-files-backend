package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Titulo.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void somaTempoTotal(Serie serie) {
//        this.tempoTotal += serie.getDuration_minutes();
//    }
//
//    public void somaTempoTotal(Movie movie) {
//        this.tempoTotal += movie.getDuration_minutes();
//    }


    public void somaTempoTotal(Titulo titulo) {
        this.tempoTotal = titulo.getDuration_minutes();
    }
}
