package Lista;

public class TarefaAdicionaElemento implements Runnable {

	private Lista lista;
	private int numeroThread;
	
	public TarefaAdicionaElemento(Lista lista, int numeroThread) {
		this.lista = lista;
		this.numeroThread = numeroThread;
	}
	
	@Override
	public void run() {
		for(int i=0; i < 100; i++) {
			lista.AdicionaElementos("Thread "+numeroThread+" - "+i);
		}
	}

}
