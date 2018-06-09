package br.com.alura.OrdenandoListas;

import java.util.ArrayList;
import java.util.List;

public class OrdenandoListas {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(4528, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(12664, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(2389, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(6577, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);
		
		Conta cc5 = new ContaPoupanca(6579, 22);
		Cliente clienteCC5 = new Cliente();
		clienteCC5.setNome("Amim");
		cc5.setTitular(clienteCC5);
		cc5.deposita(345.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		lista.add(cc5);
		
		// foreach para imprimir as contas. Lembrando que ele s� aceita imprimir esse tipo Conta pois eu
		// sobrescrevi o m�todo toString() na classe Conta, sen�o esse treco de c�digo nem compilaria.
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		// Aqui criei uma instancia da minha classe ComparatorNumeroDaConta pois o m�todo sort() exige um par�metro 
		// de compara��o, no caso minha classe usa o Numero para comparar.
		ComparatorNumeroDaConta comparator = new ComparatorNumeroDaConta();
		lista.sort(comparator);
		
		System.out.println("-----------------------");
		
		// reimprimo a lista ap�s a ordena��o para ver se tudo est� correto.
		for (Conta conta : lista) {
			System.out.println(conta+" || Titular: "+conta.getTitular().getNome());
		}
		
		// ------------------------------------------------------------------------------------------------------------
		
		
		// Abaixo temos um exemplo de classe an�nima. Esse tipo de classe foi criada para encapsular o �nico m�todo 
		//	que o nosso comparator implementa (m�todo compare).
		// Por�m, as classes an�nimas deixam a leitura mais complicada.

		//Comparando por numero da conta:
//		lista.sort(new Comparator<Conta>() {
//			@Override
//			public int compare(Conta c1, Conta c2) {
//
//				return Integer.compare(c1.getNumero(), c2.getNumero());
//			}
//		}
//		);
//		
		//Comparando por nome:		
//		lista.sort(new Comparator<Conta>() {
//
//			@Override
//			public int compare(Conta c1, Conta c2) {
//				String titular1 = c1.getTitular().getNome();
//				String titular2 = c2.getTitular().getNome();
//				
//				// Depois de armazenarmos os 2 titulares em 2 variaveis, usamos o m�todo compareTo 
//				return titular1.compareTo(titular2); 
//			}	
//			}	
//		);		

		
		//foreach para imprimir a lista ap�s a ordena��o:		
//		for (Conta conta : lista) {
//			System.out.println(conta+" || Titular: "+conta.getTitular().getNome());
//		}
//	
	}
}
