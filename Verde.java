public class Verde implements Estado {
    private Semaforo semaforo;

    public Verde(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int iniciarTimer(){
        return 5;
    }

    public void proximoEstado(){
        this.semaforo.setEstadoAtual(new Amarelo(this.semaforo));
    }

    public String toString(){
        return "Verde" + " : " + iniciarTimer() + " segundos\n";
    }
}
