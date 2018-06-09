package br.com.bytebank.banco.modelo;

public class ValorInvalidoException extends RuntimeException {

	private double SaldoAtual;
	
	public ValorInvalidoException(double SaldoAtual) {
		super("Saldo insuficiente "+SaldoAtual);
		this.SaldoAtual = SaldoAtual;
	}
	
	public double getSaldoAtual() {
		return SaldoAtual;
	}
}
