public class Amarelo implements Estado {
    private Semaforo semaforo;

    public Amarelo(Semaforo semaforo){
        this.semaforo = semaforo;
    }

    public int iniciarTimer(){
        return 1;
    }

    public void proximoEstado(){
        this.semaforo.setEstadoAtual(new Vermelho(this.semaforo));
    }

    public String toString(){
        return "Amarelo" + " : " + iniciarTimer() + " segundos\n";
    }
}
