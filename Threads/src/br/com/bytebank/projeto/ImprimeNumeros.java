package br.com.bytebank.projeto;

public class ImprimeNumeros implements Runnable {
	

	
	@Override
	public void run() {
		for(int i=0; i<=1000; i++) {
			Thread thread = Thread.currentThread();
			long id = thread.getId();
			// Abaixo temos uma forma diferente de escrever o código escrito nas 2 linhas acima			
			//long id = Thread.currentThread().getId();
			System.out.println("ID da thread em execução: "+id);
		}
	}

}
