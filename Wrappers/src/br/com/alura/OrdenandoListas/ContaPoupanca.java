package br.com.alura.OrdenandoListas;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

	
	public ContaPoupanca(int conta, int numero) {
		super(conta,numero);
	}

	@Override
	public int compareTo(ContaPoupanca outraConta) {
		return this.getNumero() - outraConta.getNumero();
	}
	
	@Override
	public String toString() {
		return "Conta Poupança "+super.toString();
	}
	
}
