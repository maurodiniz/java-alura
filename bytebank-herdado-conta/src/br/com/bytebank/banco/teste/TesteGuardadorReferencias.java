package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuradadorDeContas;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {
		GuradadorDeContas guardador = new GuradadorDeContas();
		
		Conta cc = new ContaCorrente(1245, 22544);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(4533, 16889);
		guardador.adiciona(cc2);
		
		Conta cc3 = new ContaPoupanca(45, 34455);
		guardador.adiciona(cc3);
		
		System.out.println("O total de referencias guardadas é de: "+guardador.getQtdeElementos()); 
		
		System.out.println("agencia do elemento na 3a posica: "+((Conta) guardador.getElemento(2)).getAgencia());
	}

}
