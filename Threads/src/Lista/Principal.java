package Lista;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		Lista lista = new Lista();
		
		for(int i=0; i <10; i++) {
			new Thread(new TarefaAdicionaElemento(lista,i)).start();
		}
		
		new Thread(new tarefaImprimir(lista)).start();
		
	}
}
