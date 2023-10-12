public class Verde implements Estado {
    private Semaforo semaforo;

    public Verde(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int getTimer(){
        return this.semaforo.getVerdeTimer();
    }

    public void proximoEstado(){
        this.semaforo.setEstadoAtual(new Amarelo(this.semaforo));
    }

    public String toString(){
        return "Verde" + " : " + getTimer() + " segundos\n";
    }
}
