package br.com.alura.banheiro;

public class Banheiro {
	
	private boolean estaSujo = false;

	public void fazNumero1(){
		
		synchronized(this) {
			System.out.println(Thread.currentThread().getName()+" entrando no banheiro");
			
			while(estaSujo) {
				esperandoLimpeza(Thread.currentThread().getName());
				
			}
			
	        System.out.println(Thread.currentThread().getName()+" fazendo coisa rapida");

	        try {
	            Thread.sleep(8000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println(Thread.currentThread().getName()+" dando descarga");
	        System.out.println(Thread.currentThread().getName()+" lavando a mao");
	        System.out.println(Thread.currentThread().getName()+" saindo do banheiro");
	        this.estaSujo = true;
		}
		
	}
	
	public void fazNumero2(){
		
		synchronized(this) {
			System.out.println(Thread.currentThread().getName()+" entrando no banheiro");
			
			while(estaSujo) {
				esperandoLimpeza(Thread.currentThread().getName());
			}
			
	        System.out.println(Thread.currentThread().getName()+" fazendo coisa demorada");

	        try {
	            Thread.sleep(15000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println(Thread.currentThread().getName()+" dando descarga");
	        System.out.println(Thread.currentThread().getName()+" lavando a mao");
	        System.out.println(Thread.currentThread().getName()+" saindo do banheiro");
	        this.estaSujo = true;
		}
		
	}
	
	public synchronized void esperandoLimpeza(String nome) {
		System.out.println(nome+" O banheiro está sujo. Esperando limpeza...");
		
		try {
			this.wait();			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void LimpandoBanheiro(){
		System.out.println(Thread.currentThread().getName()+" batendo na porta");
		
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+" entrando no banheiro");
			if(!estaSujo) {
				System.out.println(Thread.currentThread().getName()+" O banheiro não está sujo. Saindo");
				return;
			}
			System.out.println(Thread.currentThread().getName()+" limpando o banheiro");
			this.estaSujo = false;
			
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+" saindo do banheiro");
			this.notifyAll();
			
		}
	}
}







