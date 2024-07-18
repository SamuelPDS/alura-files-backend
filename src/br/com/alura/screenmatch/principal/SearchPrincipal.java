package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.ObdbTitle;
import br.com.alura.screenmatch.models.Titulo.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class SearchPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual filme deseja pesquisar?");
        String title = scanner.next();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t="+title+"&apikey=f9035b5d"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
//        Titulo meutitulo = gson.fromJson(response.body(), Titulo.class);
        ObdbTitle mytitle = gson.fromJson(response.body(), ObdbTitle.class);
        Titulo meutitulo = new Titulo(mytitle);
        System.out.println("Nome: "+mytitle);
        System.out.println(meutitulo);

    }
}
