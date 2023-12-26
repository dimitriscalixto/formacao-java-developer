public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(){
        this.nome = "";
        this.idade = 0;
        this.cpf = "";
    }
    public Pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}
