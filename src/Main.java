import exercises.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Song song = new Song();
//        song.play();
//
//        Movie meuFilme = new Movie();
//        meuFilme.setName("O poderoso chefão");
//        meuFilme.setReleaseDate(1970);
//        meuFilme.setDuration_minutes(180);
//        System.out.println("Duração do filme: " + meuFilme.getDuration_minutes());
//
//        meuFilme.showMovieInfo();
//        meuFilme.toRate(8);
//        meuFilme.toRate(5);
//        meuFilme.toRate(10);
//        System.out.println("Total de avaliações: " + meuFilme.getTotalRates());
//        System.out.println(meuFilme.rateAverage());
//        //meuFilme.somaDasAvaliacoes = 10;
//        //meuFilme.totalDeAvaliacoes = 1;
//        //System.out.println(meuFilme.pegaMedia());
//
//        Serie lost = new Serie();
//        lost.setName("Lost");
//        lost.setReleaseDate(2000);
//        lost.showMovieInfo();
//        lost.setTemporadas(10);
//        lost.setEpsPorTemporada(10);
//        lost.setMinutosPorEpisodio(50);
//        System.out.println("Duração para maratonar Lost: " + lost.getDuration_minutes());
//
//        Movie outroFilme = new Movie();
//        outroFilme.setName("Avatar");
//        outroFilme.setReleaseDate(2023);
//        outroFilme.setDuration_minutes(200);
//
//        CalculadoraTempo calculadora = new CalculadoraTempo();
//        calculadora.somaTempoTotal(meuFilme);
//        calculadora.somaTempoTotal(outroFilme);
//        calculadora.somaTempoTotal(lost);
//        System.out.println(calculadora.getTempoTotal());
//
//        RecomendationFilter filtro = new RecomendationFilter();
//        filtro.Verify(meuFilme);
//
//        Episode episodio = new Episode();
//        episodio.setEpisodeNum(1);
//        episodio.setSerie(lost);
//
//        var SamuelMovie = new Movie();
//        SamuelMovie.setDuration_minutes(120);
//        SamuelMovie.setName("The Hobbit");
//        SamuelMovie.toRate(9);
//        SamuelMovie.toRate(8);
//
//        filtro.Verify(SamuelMovie);
//
//        ArrayList<Movie> movieArrayList = new ArrayList<>();
//        movieArrayList.add(meuFilme);
//        movieArrayList.add(SamuelMovie);
//        movieArrayList.add(outroFilme);
//        System.out.println(movieArrayList);
//        System.out.println(movieArrayList);
//        System.out.println("To string do filme" + movieArrayList.get(0).toString());
        ArrayList<Person> peopleList = new ArrayList<>();

        var samuel = new Person();
        samuel.setName("Samuel");
        samuel.setAge(18);

        var paulo = new Person();
        paulo.setName("Paulo");
        paulo.setAge(10);

        var marina = new Person();
        marina.setName("Marina");
        marina.setAge(35);

        peopleList.add(samuel);
        peopleList.add(paulo);
        peopleList.add(marina);

        System.out.println("List length: " + peopleList.size());
        System.out.println("First person: " + peopleList.get(0).toString());
        for(Person person: peopleList) {
            System.out.println(person);
        }
//        System.out.println("All people list" + peopleList);
    }


}