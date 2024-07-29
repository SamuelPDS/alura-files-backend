package exercises;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ChallengeViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter fileWriter = new FileWriter("ViaCep.json");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu cep");
        String cep = scanner.next();

        String url = "https://viacep.com.br/ws/"+cep+"/json/";

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = httpClient
                .send(request, HttpResponse.BodyHandlers.ofString());

        fileWriter.write(gson.toJson(response.body()));
        fileWriter.close();
    }
}
