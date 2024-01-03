package DesafioUML;

public class Iphone implements AparelhoTelefonico,NavegadorNaInternet,ReprodutorMusical{
    public void tocar(){
        System.out.println("Tocando música");
    }
    public void pausar(){
        System.out.println("Pausando");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música");
    }

    public void ligar(){
        System.out.println("Ligando");
    }

    public  void atender(){
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorrerioVoz(){
        System.out.println("Iniciando correrio voz");
    }

    public void exibirPagina(){
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba(){
        System.out.println("adicionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }
}
