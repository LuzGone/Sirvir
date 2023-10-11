

public class Main {

	public static void main(String[] args) {
		Semaforo epitacio = new Semaforo("12356");
		System.out.println("Estado Atual: " + epitacio.getEstadoAtual());
		System.out.println("Significado : " + epitacio.getEstadoAtual());
		//epitacio.exibir();
		
		epitacio.start();
		
		System.out.println("Fim da simulacao.");
		
		System.out.println(epitacio);
				

	}

}
