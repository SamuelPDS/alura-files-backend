import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = new Random().nextInt(100);
        int numberGuessed = 0;
        System.out.println(randomNum);
        for(int chances = 5; chances >= 1; chances--) {
            System.out.println("Tentativas restantes: " + chances);
            System.out.println("Tente adivinhar o número:");
            numberGuessed = scanner.nextInt();

            if (numberGuessed == randomNum) {
                System.out.println("Parabéns! O número adivinhado foi: " + randomNum);
                break;
            }

            if (chances == 1) {
                System.out.println("Tentativas zeradas!");
                break;
            }
        }
    }
}
