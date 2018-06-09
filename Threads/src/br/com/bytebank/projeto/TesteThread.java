package br.com.bytebank.projeto;

public class TesteThread {

	public static void main(String[] args) {
		
		Runnable Tarefa = new ImprimeString();
		
		Thread thread = new Thread(Tarefa);
		
		thread.start();
	}
}
