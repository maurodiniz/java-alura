import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");
		
		// Adicionando Aulas no curso criado acima.
		javaColecoes.setAulas(new Aula("Lists e StringLists", 18));
		javaColecoes.setAulas(new Aula("Criando uma Aula", 12));
		javaColecoes.setAulas(new Aula("Modelando com Colections",20));
		javaColecoes.setAulas(new Aula("Relacionamentos com Cllections", 26));
		javaColecoes.setAulas(new Aula("Aplicando Sets",11));

		// Adicionando Alunos no curso criado acima.
		javaColecoes.setAlunos(new Aluno("Rodrigo Turini", 34672));
		javaColecoes.setAlunos(new Aluno("Paulo Silveira", 54678));
		javaColecoes.setAlunos(new Aluno("Carlos Alberto", 12999));
		javaColecoes.setAlunos(new Aluno("Nico Steppat", 12));
		javaColecoes.setAlunos(new Aluno("Sergio Lopes", 976));
		
		// Criei o aluno abaixo mas não adicionei no curso para poder testar o metodo 'estaMatriculado' abaixo
		Aluno a1 = new Aluno("Fernando Alb",25999);
		javaColecoes.setAlunos(a1);
		
		System.out.println("Alunos deste Curso:");
		for (Aluno aluno : javaColecoes.getAlunos()) {
			System.out.println(aluno);
		}
		
		if (javaColecoes.estaMatriculado(a1)) {
			System.out.println("O aluno "+a1.getNome()+" está matriculado no curso.");
		} else {
			System.out.println("O aluno "+a1.getNome()+" não está matriculado no curso.");
		}

		// usando Iterator para imprimir o conteudo de Listas ou Sets.
		// Esse tipo de código era usado antes de existir o foreach
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		System.out.println("Usando Iterator");
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
