public class SmarTv {
    private Boolean ligada = false;
    private int canal;
    private int volume;

    public static void main(String[] args) {
        SmarTv tv1 = new SmarTv(false,0,0);
        tv1.mudarVolume(20);
        System.out.println(tv1.volume);
    }
    public SmarTv(Boolean ligada, int canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public void ligarTv(){
        this.ligada = true;
    }

    public void mudarCanal(int numCanal){
        this.canal = numCanal;
    }

    public void mudarVolume(int volume){
        this.volume += volume;
    }
}
