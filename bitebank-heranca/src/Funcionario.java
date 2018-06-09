
public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	private int tipo = 0; // 0 - comum, 1 - gerente, 2 - diretor
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;		
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
}
