import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private int tempoTotal;
	private Set<Aluno> alunos = new HashSet<Aluno>(); 
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}
	
	public void setAulas(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;		
	}
	
	// Além de adicionar um elemento no set de alunos, tb insiro no mapa matriculaParaAluno
	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public int getTempoTotal() {
		tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();			
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "Nome do curso: "+nome+". Tempo total: "+getTempoTotal()+" minutos";
		
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	// dado um numero de matricula, chamo o metodo get() para me retornar o aluno referente à aquela matricula
	public Aluno buscaMatriculado(int numero) {
		return this.matriculaParaAluno.get(numero);
		
		
		
	}
}
