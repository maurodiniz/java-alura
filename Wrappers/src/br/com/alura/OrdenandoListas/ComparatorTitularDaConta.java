package br.com.alura.OrdenandoListas;

import java.util.Comparator;

public class ComparatorTitularDaConta implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String titular1 = c1.getTitular().getNome();
		String titular2 = c2.getTitular().getNome();
		
		// Depois de armazenarmos os 2 titulares em 2 variaveis, usamos o método compareTo 
		return titular1.compareTo(titular2);
		
		// Caso queira, tb posso fazer a comparação diretamente sem armazenar nenhum valor em nenhuma variável. 
		// O código fica mais extenso porém funciona da mesma forma.
		//return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
	}

}
