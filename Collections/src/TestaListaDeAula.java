import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 15);
		Aula a3 = new Aula("Relacionamentos de Listas e Objetos", 12);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		// Collections.sort ir� pegar os itens de 'aulas' e usar esse metodo Comparator.comparing usando 
		// o metodo getTempo que est� na calasse Aula como refer�ncia para ordena��o.
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));		
		// Por�m existe outra forma de escreve-lo, por exemplo:
		aulas.sort(Comparator.comparing(Aula::getTempo)); // apesar da diferen�a, OS 2 TEM O MESMO EFEITO PR�TICO!!
		
		System.out.println(aulas);
	}
}
