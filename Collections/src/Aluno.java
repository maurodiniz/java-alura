
public class Aluno {

	private String nome;
	private int numeroMatricula;
	
	// Construtor
	public Aluno(String nome, int matricula) {
		if(nome == null) {
			throw new NullPointerException("O nome n�o deve ser null.");
		}
		
		this.nome = nome;
		this.numeroMatricula = matricula;
	}
	
	// Gets & Sets - in�cio
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.numeroMatricula;
	}
	// Gets & Sets - fim
	
	@Override
	public String toString() {
		return "[Aluno: "+this.nome+", Matricula: "+this.numeroMatricula+"]";
	}

	// Usei o pr�prio eclipse para gerar os 2 overrides abaixo (CTRL + 3, digitar 'equals');
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroMatricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {				
//		return this.nome.equals((Aluno) obj);
//		
//		// Outra maneira de escrever a linha de c�digo acima:
//		//Aluno outro = (Aluno) obj;
//		//return this.nome.equals(outro);
//	}
//	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}
	
	
	
}
