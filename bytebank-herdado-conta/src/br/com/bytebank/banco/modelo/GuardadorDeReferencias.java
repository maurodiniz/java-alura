package br.com.bytebank.banco.modelo;


// Esta classe tem a mesma estrutura da classe 'GuardadorDeContas', por�m modifiquei para poder guardar 
//	qualquer referencia do tipo 'Object', e n�o apenas do tipo 'Conta'.
public class GuardadorDeReferencias {

	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object conta) {
		this.referencias[this.posicaoLivre] = conta;
		this.posicaoLivre++;
	}
	
	public int getQtdeElementos() {
		return this.posicaoLivre;
	}
	
	public Object getElemento(int posicao) {
		return this.referencias[posicao];
	}
}