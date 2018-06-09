import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do Java","Paulo Silveira");
		
		//formas de adicionar itens na lista, por�m como manda as boas pr�ticas do encapsulamento n�o � correto deixar
		// outras classes inserirem diretamente itens em outras. por isso adicionei 'return Collections.unmodifiableList(aulas);'
		// no metodo getAulas.
		// Isso faz com que o metodo retorne uma c�pia 'read only' da lista de aulas daquela referencia.
		//javaColecoes.getAulas().add(new Aula("Trabalhando com Arrays", 12));
		javaColecoes.setAulas(new Aula("Lists e StringLists", 18));
		
		javaColecoes.setAulas(new Aula("Criando uma Aula", 12));
		javaColecoes.setAulas(new Aula("Modelando com Colections",20));
		
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(javaColecoes.getTempoTotal()+" minutos");
		
		System.out.println(javaColecoes);
		
		// ORDENANDO A LISTA DE AULAS 
		List<Aula> aulasOrdenadas = new ArrayList<>(javaColecoes.getAulas());
		
		Collections.sort(aulasOrdenadas);
		System.out.println(aulasOrdenadas);
		// ORDENANDO A LISTA DE AULAS (FIM)
	}
}
