package br.com.alura.banheiro;

public class LimpandoBanheiro implements Runnable {

	private Banheiro banheiro;
	
	public LimpandoBanheiro(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
	
	@Override
	public void run() {
		
		// quando escrevo while(true), quero dizer para esse laço sempre voltar a executar.
		// no caso como dentro dele tenho um comando de sleep(17000), esse laço entrará em execução a cada 17segundos.
		while(true) {
			this.banheiro.LimpandoBanheiro();
			
			try {
				Thread.sleep(17000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
