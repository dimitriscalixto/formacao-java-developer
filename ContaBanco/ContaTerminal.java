package ContaBanco;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String agencia, nomeCliente;
        int numero;
        Float saldo;
        System.out.println("Por favor, digite o número da agência !");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da conta do banco");
        numero = sc.nextInt();
        System.out.println("Por favor, digite seu nome");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite seu saldo");
        saldo = sc.nextFloat();
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + " conta " + numero + " e seu saldo " + saldo +" já está disponível para saque.");
    }
}
