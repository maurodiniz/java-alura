package Lista;

public class tarefaImprimir implements Runnable {

	private Lista lista;

	
	public tarefaImprimir(Lista lista) {
		this.lista = lista;
	}
	
	@Override
	public void run() {
		for(int i=0; i < lista.Tamanho();i++) {
			System.out.println(i+" - "+lista.getElemento(i));
		
		}
	}

}
