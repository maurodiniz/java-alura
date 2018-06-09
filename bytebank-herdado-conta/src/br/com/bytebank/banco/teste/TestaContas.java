package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(23672, 128966);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(12344, 124444);
		cp.deposita(100);
		
		cc.transfere(10, cp);
		
		System.out.println("O saldo da CC é de R$"+cc.getSaldo());
		System.out.println("O saldo da CP é de R$"+cp.getSaldo());
	}
}
