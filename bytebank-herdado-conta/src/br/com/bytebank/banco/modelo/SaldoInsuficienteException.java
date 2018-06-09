package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends RuntimeException{

	public SaldoInsuficienteException() {
		super();
	}
	
	public SaldoInsuficienteException(String s) {
		super(s);
	}
}
