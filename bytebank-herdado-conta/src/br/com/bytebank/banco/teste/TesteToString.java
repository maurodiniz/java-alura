package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteToString {

	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(1256, 975555);
		Object cp = new ContaPoupanca(1244, 988880);
		
		System.out.println(cc);
		System.out.println(cp);
	}
}
