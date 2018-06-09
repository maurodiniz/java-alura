import java.util.HashMap;
import java.util.Map;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
//Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");
//		
//		// Adicionando Aulas no curso criado acima.
//		javaColecoes.setAulas(new Aula("Lists e StringLists", 18));
//		javaColecoes.setAulas(new Aula("Criando uma Aula", 12));
//		javaColecoes.setAulas(new Aula("Modelando com Colections",20));
//		javaColecoes.setAulas(new Aula("Relacionamentos com Cllections", 26));
//		javaColecoes.setAulas(new Aula("Aplicando Sets",11));
//
//		// Adicionando Alunos no curso criado acima.
//		javaColecoes.setAlunos(new Aluno("Rodrigo Turini", 34672));
//		javaColecoes.setAlunos(new Aluno("Paulo Silveira", 54678));
//		javaColecoes.setAlunos(new Aluno("Carlos Alberto", 12999));
//		javaColecoes.setAlunos(new Aluno("Nico Steppat", 12));
//		javaColecoes.setAlunos(new Aluno("Sergio Lopes", 976));
//
//		
//		System.out.println(javaColecoes.buscaMatriculado(12));
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        for (Integer a : pessoas.keySet()) {
			System.out.println(a);
		}
        
		
	}
}
