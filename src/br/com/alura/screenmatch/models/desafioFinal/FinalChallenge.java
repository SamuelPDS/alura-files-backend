package br.com.alura.screenmatch.models.desafioFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FinalChallenge implements Comparable<FinalChallenge> {
    String name;
    Double price;

    @Override
    public int compareTo(FinalChallenge shopping) {
        return price.compareTo(shopping.price);
    }

    @Override
    public String toString() {
        return
                "Product: '" + name + '\'' +
                ", price:" + price +
                '}';
    }

    public static void main(String[] args) {
        List<FinalChallenge> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo do cartao");
        double saldo = scanner.nextDouble();
        System.out.println("Saldo no cartão: R$ " + saldo);
        System.out.println("O que deseja fazer? 1 - comprar; 0 - sair");
        int opcao = scanner.nextInt();
        while (opcao != 0){
            var newShopping = new FinalChallenge();
            System.out.println("Nome do Produto");
           newShopping.name =  scanner.next();
            System.out.println("Preço");
            newShopping.price = scanner.nextDouble();
            if (newShopping.price > saldo) {
                System.out.println("Você não possui saldo suficiente!");
                break;
            }
        list.add(newShopping);

            System.out.println("Deseja continuar? 1 - sim, 0 - não");
            opcao = scanner.nextInt();
        }
        Collections.sort(list);
        System.out.println("Compras totais: "+ list);
    }
}
