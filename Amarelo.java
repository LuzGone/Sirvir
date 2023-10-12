public class Amarelo implements Estado {
    private Semaforo semaforo;

    public Amarelo(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int getTimer(){
        return this.semaforo.getAmareloTimer();
    }

    public void proximoEstado(){
        this.semaforo.setEstadoAtual(new Vermelho(this.semaforo));
    }

    public String toString(){
        return "Amarelo" + " : " + getTimer() + " segundos\n";
    }
}
