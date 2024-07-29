package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exceptions.YearConvertinException;
import br.com.alura.screenmatch.models.ObdbTitle;
import br.com.alura.screenmatch.models.Titulo.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchPrincipal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String title = "";
        List<Titulo> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!title.equalsIgnoreCase("sair")) {
            System.out.println("Qual filme deseja pesquisar? Digite 'sair' para sair");
            title = scanner.next();

            if (title.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://www.omdbapi.com/?t=" + title.replace(" ", "+") + "&apikey=f9035b5d"))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
//                System.out.println(response.body());


                Titulo meutitulo = gson.fromJson(response.body(), Titulo.class);
                ObdbTitle mytitle = gson.fromJson(response.body(), ObdbTitle.class);

                titles.add(meutitulo);

            } catch (NumberFormatException e) {
                System.out.println("Erro!");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na busca");
            } catch (YearConvertinException e) {
                System.out.println(e.getMessage());
            }
        }
        FileWriter fileWriter = new FileWriter("text.json");
        fileWriter.write(gson.toJson(titles));
        fileWriter.close();
        //                FileWriter file = new FileWriter("text");
//                file.write(response.body());
        System.out.println(titles);
    }
}
