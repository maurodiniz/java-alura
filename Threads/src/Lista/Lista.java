package Lista;

public class Lista {

	private String[] elementos = new String[1000];
	private int id=0;
	
	public synchronized void AdicionaElementos(String elemento) {
		this.elementos[id] = elemento;
		this.id++;
	}
	
	public int Tamanho() {
		return this.elementos.length;
	}
	
	public String getElemento(int posicao) {
		return this.elementos[posicao];
	}
	
	
}
