package br.com.alura.screenmatch.models.exer2;

import br.com.alura.screenmatch.models.Titulo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exer2 {
    public static void main(String[] args) {
        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(89);
        intNumbers.add(343);
        intNumbers.add(34);
        intNumbers.add(5);
        intNumbers.add(6);
        intNumbers.add(56);
        intNumbers.add(76);
        intNumbers.add(433);
        intNumbers.add(23434);

        Collections.sort(intNumbers);
        System.out.println("Números ordenados:" + intNumbers);

        var title1 = new Titulo("teste", 2020);
        var title2 = new Titulo("teste", 2020);
        var title3 = new Titulo("teste", 2020);
        var title4 = new Titulo("teste", 2020);

        List <Titulo> titleList = new ArrayList<>();
        titleList.add(title1);
        titleList.add(title2);
        titleList.add(title3);
        titleList.add(title4);

        Collections.sort(titleList);

    }
}
