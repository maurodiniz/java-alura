import java.util.ArrayList;
import java.util.Collections;

public class TestaArrayList {

	public static void main(String[] args) {
		
		
		String aula1 = "Modelando a Classe Aula";
		String aula2 = "Conhecendo mais sobre Listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		String aula4 = "Aplicando a Collection de Listas";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		System.out.println(aulas); // aqui irá imprimir na tela as strings que adicionei à Lista;
		
		//aulas.remove(1); // para remover algum item da Lista usamos '.remove' e passamos o indice do item que queremos remover
		
		for(String aula : aulas) {
			System.out.println("Aula: "+aula);
		}
		
		// Para acessar apenas um indice da lista sem ter que percorrer ela inteira, podemos usar '.get'
		System.out.println("O conteúdo da 2a aula é: "+aulas.get(1));
		
		//Outro metodo de impressão de um item da lista por linha
		for(int i=0; i < aulas.size();i++) {
			System.out.println("aula: "+aulas.get(i));
		}
		
		// Para ordenar os itens da lista por ordem alfabética
		System.out.println("Antes de ordenado: "+aulas);
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: "+aulas);
		
	}
}
