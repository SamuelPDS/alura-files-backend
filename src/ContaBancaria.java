public class ContaBancaria {
    private int numConta;
    private double saldo;
    private String titular;

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public static void main(String[] args) {
    var myBank = new ContaBancaria();
    myBank.setNumConta(4356);
    myBank.setSaldo(3500);
    myBank.setTitular("Samuel");

        System.out.println(myBank.getTitular());
        System.out.println(myBank.getNumConta());
        System.out.println(myBank.getSaldo());
    }
}
