package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalcDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(12345, 239851);
		
		try {
		cc.deposita(100);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage()); 
		}
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalcDeImposto ci = new CalcDeImposto();
		
		ci.registro(cc);
		ci.registro(sv);
		
		System.out.println("O total tributado desta conta é de R$"+ci.getTotalImposto());
				
	}
}
