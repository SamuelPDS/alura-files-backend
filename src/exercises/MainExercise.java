package exercises;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainExercise {
    public static void main(String[] args) {
//        Gson gson = new GsonBuilder().disableJdkUnsafe().create();
//
//        String person = "{\"name\":\"Rodrigo\",\"city\":\"Brasília\"}";
//
//        PersonDTO convertedPeople = gson.fromJson(person, PersonDTO.class);
//        System.out.println(convertedPeople);

    String book = "{\"title\":\"Aventuras do Java\",\"author\":\"Akemi\",\"publisher\":{\"name\":\"TechBooks\",\"address\":\"São Paulo\"}}";

    Gson gson = new Gson();
    Book formnatedBook= gson.fromJson(book, Book.class);

        System.out.println(formnatedBook);
    }
}
