package exercises.class3;

public class Main {
    public static void main(String[] args) {
        try {
        User samuel = new User("1234dfgrt");
            System.out.println(samuel);
        } catch (InvalidPasswordException e) {
            System.out.println(e);
        }
    }
}
