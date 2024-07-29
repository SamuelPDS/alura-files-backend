package exercises.class3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GitHubAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digit the username that U wanna know");
        String username = scanner.next();
        String url = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request =  HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            if (response.statusCode() == 404) {
                System.out.println("users not founded");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
