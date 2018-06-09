package br.com.alura.OrdenandoListas;

public class SaldoInsuficienteException extends RuntimeException{

	public SaldoInsuficienteException() {
		super();
	}
	
	public SaldoInsuficienteException(String s) {
		super(s);
	}
}
