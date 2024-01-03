package Poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro formula1 = new Carro();
        formula1.setChassi("989009");
        //formula1.ligar();

        Moto z400 = new Moto();
        z400.setChassi("2313213312");
        //z400.ligar();

        Veiculo coringa = formula1;
        coringa.ligar();
    }
}
