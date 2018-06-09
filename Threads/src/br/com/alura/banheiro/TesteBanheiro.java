package br.com.alura.banheiro;

public class TesteBanheiro {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro),"João");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro),"Pedro");
		Thread Limpeza = new Thread(new LimpandoBanheiro(banheiro),"Limpeza");
		Limpeza.setDaemon(true);
		Thread convidado3 = new Thread(new TarefaNumero1(banheiro),"Ana");
		Thread convidado4 = new Thread(new TarefaNumero2(banheiro),"Claudio");
		
		
		
		convidado1.start();
		convidado2.start();
		Limpeza.setPriority(Thread.MAX_PRIORITY);
		Limpeza.start();
		convidado3.start();
		convidado4.start();
	}
	
}
