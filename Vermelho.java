public class Vermelho implements Estado{
    private Semaforo semaforo;

    public Vermelho(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int getTimer(){
        return this.semaforo.getVermelhoTimer();
    }

    public void proximoEstado(){
        this.semaforo.setEstadoAtual(new Verde(this.semaforo));
    }

    public String toString(){
        return "Vermelho" + " : " + getTimer() + " segundos\n";
    }
}
