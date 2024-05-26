import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

//        for (int i = 0; i < 3; i++) {
//        System.out.println("Diga sua avaliação para o filme  ");
//           nota = leitura.nextDouble();
//            mediaAvaliacao += nota;
//        }

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            } else {
                System.out.println("Encerrando");
                break;
            }
        }
        mediaAvaliacao = mediaAvaliacao/totalNotas;
        System.out.println("Media:" + mediaAvaliacao);
    }
}
