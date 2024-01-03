package Interfaces;

public class EquipamentoMultifuncional implements Copiadora,Digitalizadora,Impressora {
    public void copiar(){
        System.out.println("COPIANDO");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO");
    }

    public void imprimir(){
        System.out.println("IMPRIMINDO");
    }
}
