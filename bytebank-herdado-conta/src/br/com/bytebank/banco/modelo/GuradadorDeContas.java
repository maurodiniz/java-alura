package br.com.bytebank.banco.modelo;

public class GuradadorDeContas {

	private Object[] referencias;
	private int posicaoLivre;
	
	public GuradadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta conta) {
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
