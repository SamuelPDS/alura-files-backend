import java.util.Scanner;

public class ContaBancaria {
    String name;
    double accountBalance;
    String accountType;
    //criar conta bancaria com 1 - consultar saldo, 2 - receber valor, 3 - transferir valor e sair
    public static void main(String[] args) {
        int option = 0;
        int value = 0;
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        ContaBancaria person1 = new ContaBancaria();
        person1.name = "Samuel Charles";
        person1.accountBalance = 3000.05;
        person1.accountType = "Corrente";

        System.out.println("Digite o que deseja:");
        System.out.println("1 - consultar saldo");
        System.out.println("2 - receber valor");
        System.out.println("3 - transferir valor");
        System.out.println("4 - sair");

        option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Extrato" +
                        "================================" + "\n" +
                        "Nome: " + person1.name + "\n" +
                        "Saldo: " + "R$"+person1.accountBalance + "\n" +
                        "Conta: " + person1.accountType);
            break;

            case 2:
                System.out.println("Quando deseja receber?");
                value = scanner.nextInt();
                if (value > person1.accountBalance) {
                    System.out.println("O valor não poder ser menor que o da conta atual!");
                    break;
                }
                person1.accountBalance -= value;
                System.out.println("Saldo atual: R$" + person1.accountBalance);
                break;

            case 3:
                System.out.println("Quanto deseja transferir?");
                value = scanner.nextInt();
                person1.accountBalance += value;
                System.out.println("Feito! O valor atual é: R$" + person1.accountBalance);
                break;

            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção não encontrada!");
        }


    }

}
