import java.lang.Thread;

public class Semaforo {
	
	private String numTombamento = null;

	private Estado estado = new Vermelho(this);
	
	public Semaforo(String numTombamento) {
        this.numTombamento = numTombamento;
	}
	
	public String getNumTombamento() {
		return numTombamento;
	}

	public void setNumTombamento(String numTombamento) {
		this.numTombamento = numTombamento;
	}

	public void setEstadoAtual(Estado estado){
		this.estado = estado;
	}
	
	public Estado getEstadoAtual() {
		return this.estado;
	}
	
	
	public void exibir() {
		System.out.println(" vermelho  ( " + (this.estado instanceof Vermelho?"X":" ") + " )");
		System.out.println(" amarelo   ( " + (this.estado instanceof Amarelo?"X":" ") + " )");
		System.out.println(" verde     ( " + (this.estado instanceof Verde?"X":" ") + " )");
	}
	
	public void efetuarTransicao() {
	    this.estado.proximoEstado();
	}
	
	public void showVisorRegressivo() {
		for (int i = this.estado.iniciarTimer(); i >0 ; i--) {
			System.out.println(i + " segundo(s)");
			try {
				// 1000 milisegundos equivale a 1 segundo
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void start() {
		this.start(10);
	}

	public void start(int time_in_seconds) {
		while(time_in_seconds > 0) {
			System.out.println("Tempo restante da simulacao: " + time_in_seconds + " segundos");
			System.out.println( getEstadoAtual() + " : " + this.estado.iniciarTimer() + " segundos.");
			exibir();
			time_in_seconds -= this.estado.iniciarTimer();
			showVisorRegressivo();
			efetuarTransicao();
			System.out.println();
		}
		
	}
	
	public String toString() {
		String s = "";
		s += "Numero Tombamento: " + numTombamento + "\n";
		s += "Tempo de permanencia em cada estagio:\n";
		s += "Vermelho: "+ "";
		s += "Verde: " + "";
		s += "Amarelo: " + "";
		return s;
	}
	

}
