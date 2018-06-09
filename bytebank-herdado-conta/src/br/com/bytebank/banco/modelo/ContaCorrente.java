package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia,numero);		
	}
	
	public double getValorImposto() {
		return super.saldo *0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente "+super.toString();
	}
}
