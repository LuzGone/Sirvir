public class Vermelho implements Estado{
    private Semaforo semaforo;

    public Vermelho(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int iniciarTimer(){
        return 3;
    }

    public void proximoEstado(){
        this.semaforo.setEstadoAtual(new Verde(this.semaforo));
    }

    public String toString(){
        return "Vermelho" + " : " + iniciarTimer() + " segundos\n";
    }
}
