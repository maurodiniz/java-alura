package br.com.alura.OrdenandoListas;

import java.util.Comparator;

public class ComparatorNumeroDaConta implements Comparator<Conta>{

	
	// Aqui estou ordenando as contas com base no Numero, caso o numero seja igual, ordeno pelo nome.
	@Override
	public int compare(Conta c1, Conta c2) {

//		return Integer.compare(c1.getNumero(), c2.getNumero());
		
		// Aqui temos um outro jeito de comparar os numeros, mais didático porém mais extenso;
		if(c1.getNumero() < c2.getNumero()) {
				return -1;			
		}
		
		if (c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		
		if ((c1.getNumero() == c2.getNumero()) && (c1.getTitular().getNome().compareTo(c2.getTitular().getNome()) < 0)) {
			return -1;
		}
		
		return 0;
	}	

}
