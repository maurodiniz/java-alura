package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		Collection<ContaPoupanca> listaContas = new ArrayList<ContaPoupanca>();
		
		ContaPoupanca c1 = new ContaPoupanca(12435, 87654);
		c1.deposita(1000);
		
		ContaPoupanca c2 = new ContaPoupanca(90882, 888223);
		c2.deposita(250);
		
		ContaPoupanca c3 = new ContaPoupanca(33222, 1234444);
		c3.deposita(950);
		
		listaContas.add(c1);
		listaContas.add(c2);
		listaContas.add(c3);
		
		// Collections.sort(listaContas);
		
		for(ContaPoupanca contas : listaContas) {
			System.out.println(contas);		
		}
		
		// mapas
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("Gerente", c1);
		mapaDeContas.put("Atendente", c2);
		mapaDeContas.put("Professor", c3);
		
		// Apenas passando a referencia "Gerente" consigo buscar qual é a Conta correspondente sem fazer for para
		//   percorreer a lista toda.
		Conta contaGerente = mapaDeContas.get("Gerente");
		
		System.out.println(contaGerente.getSaldo());
		
		//fim mapas
		
	}
}
