package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Titulo.Movie;
import br.com.alura.screenmatch.models.Titulo.Serie;
import br.com.alura.screenmatch.models.Titulo.Titulo;
import exercises.Person;

import java.util.*;

public class ArrayPrincipal {
    public static void main(String[] args) {
        Movie meuFilme = new Movie("O poderoso chefão", 1970);
        meuFilme.toRate(10);
        Serie lost = new Serie("Lost", 2000);
        Movie outroFilme = new Movie("Avatar", 2023);
        var SamuelMovie = new Movie("The Hobbit", 1990);


        ArrayList<Titulo> TitleArrayList = new ArrayList<>();
        TitleArrayList.add(meuFilme);
        TitleArrayList.add(SamuelMovie);
        TitleArrayList.add(outroFilme);
        TitleArrayList.add(lost);
        System.out.println("To string do filme" + TitleArrayList.get(0).toString());
        ArrayList<Person> peopleList = new ArrayList<>();

        for(Titulo title: TitleArrayList) {
            System.out.println(title);

        if(title instanceof Movie movie) System.out.println(((Movie) title).getClassification());
        }


//        TitleArrayList.forEach(title -> System.out.println(title));
////        TitleArrayList.forEach(System.out::println);


        List<String> searchByArtist = new LinkedList<>();
    searchByArtist.add("Julio");
    searchByArtist.add("Amanda");
    searchByArtist.add("Paulo");
    searchByArtist.add("Pedro");
    searchByArtist.add("Julio");

        System.out.println("nome ordenados:");
        Collections.sort(searchByArtist);

        System.out.println("Filmes em ordem");
        System.out.println(searchByArtist);
        Collections.sort(TitleArrayList);
        System.out.println(TitleArrayList);
        TitleArrayList.sort(Comparator.comparing(Titulo::getReleaseDate));
        System.out.println(TitleArrayList);
    }

}
