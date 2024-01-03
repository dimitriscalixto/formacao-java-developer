package Poo;

public class Carro extends Veiculo {


    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro ligado");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo Combustível");
    }
    private void conferirCambio(){
        System.out.println("Conferindo câmbio em partida");
    }
}
