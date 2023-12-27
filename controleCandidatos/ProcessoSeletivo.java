package controleCandidatos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        //primeiro um for para selecionar os candidatos
        for(String candidato: candidatosSelecionados) {
            ligarCandidato(candidato);
        }

    }
    static void ligarCandidato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");


    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static  void imprimirCandidatos(){
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        //forma indexada
        //quando preciso do indice para complementar a lógica
        System.out.println("Imprimindo com a ordem de seleção pelo índice");
        for(int x=0; x<candidatosSelecionados.length; x++) {
            System.out.println((x+1)+ "° Candidato é " + candidatosSelecionados [x] );
        }

        //forma abrevida
        //interação total sem precisar da posição ou indice
        System.out.println("Imprimindo todos sem a necessidade de exibir o índice");

        for(String candidato: candidatosSelecionados) {
            System.out.println(candidato);
        }
    }
    static  void selecaoCandidatos(){
        // Array com a lista de candidatos
        double salarioBase = 2000.0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionados = 0;
        int proximoCandidato = 0;
        while(totalSelecionados <5 && proximoCandidato < candidatos.length) {
            String candidato = candidatos[proximoCandidato++];
            double valorPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " está pedindo " + valorPretendido);
            if(valorPretendido > salarioBase) {
                System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");

            }else {
                System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");
                totalSelecionados++;
            }

        }
        System.out.println("Total de selecionados: " + totalSelecionados);
        System.out.println("Total de consultados: " + proximoCandidato);

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
     static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}








