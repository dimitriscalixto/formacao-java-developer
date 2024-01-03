package Banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.depositar(100);

        System.out.println(conta1.getSaldo());

        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(200);

        conta1.transferir(100,conta2);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}
