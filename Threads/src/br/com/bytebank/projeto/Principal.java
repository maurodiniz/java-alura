package br.com.bytebank.projeto;

public class Principal {

	public static void main(String[] args) {
		
		String buscar = "Ann";
		
		// Ao invés de instanciar 3 objetos para buscar nos 3 arquivos diferentes como está comentado, crio  
		//   direto na criação da thread logo mais abaixo. Evitando assim repetição desnecessária de código.
//		TarefaBuscaNome buscarNomeLista1 = new TarefaBuscaNome("assinaturas1.txt", buscar);
//		TarefaBuscaNome buscarNomeLista2 = new TarefaBuscaNome("assinaturas2.txt", buscar);
//		TarefaBuscaNome buscarNomeLista3 = new TarefaBuscaNome("autores.txt", buscar);
		
		Thread threadautores = new Thread(new TarefaBuscaNome("autores.txt",buscar));
		
		Thread assinaturas1 = new Thread(new TarefaBuscaNome("assinaturas1.txt",buscar));
		
		Thread assinaturas2 = new Thread(new TarefaBuscaNome("assinaturas2.txt",buscar));
		
		// Iniciando as Threads
		threadautores.start();
		assinaturas1.start();
		assinaturas2.start();
	}
}
