package Banco;

public class Conta {
    private static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    private double saldo;
    public  Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA;
        this.numero = SEQUENCIAL++;
    }
    public String sacar(double valor){
        if(valor > saldo){
            return "Valor maior que saldo";
        } else {
            this.saldo -= valor;
            return "Saque efetuado com sucesso";
        }
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(){

    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

}
