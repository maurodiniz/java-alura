import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Paulo Silveira");
		alunos.add("Carlos Alberto");
		alunos.add("Nico Steppat"); 
		alunos.add("Sergio Lopes");
		
//		for (String string : alunos) {
//			System.out.println(string);
//		}
//		
//		System.out.println(alunos);
//		
//		System.out.println(alunos.contains("Rodrigo Turini"));
		
		// A maior desvantagem dos Sets é que não conseguimos acessar elementos especificos presentes dentro deles, por exemplo
		// não conseguimos usar o comando '.get()' e '.remove()'
		
		
		System.out.println(alunos.size());
		
		alunos.add("Paulo Silveira");
		
		System.out.println(alunos.size());
	}
}
