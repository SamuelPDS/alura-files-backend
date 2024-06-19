package br.com.alura.screenmatch.calculos;

public class RecomendationFilter {
    public boolean Verify(Classificable classificable) {
        System.out.println("Estrela(s): " + classificable.getClassification());
        return classificable.getClassification() >= 3;
    }
}
