public enum EstadoBrasileiro {
    SAO_PAULO("SP","São Paulo"),
    RIO_DE_JANEIRO("RJ","Rio de janeiro"),
    PIAUI("PI","Piauí"),
    MARANHAO("MA","Maranhão"),
    ACRE("AC","Rio Branco");
    private String nome;
    private String sigla;

    EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
