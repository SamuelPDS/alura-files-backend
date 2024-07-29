package exercises.class3;

public class User {
    private String password;

    public User() {};

    public User(String password) {
        if (password.length() <=8) throw new InvalidPasswordException("the password must contain more than 8 characters");
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                '}';
    }
}
