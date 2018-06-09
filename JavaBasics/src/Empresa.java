
public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	
	public void Adiciona(Funcionario f) {
		for(int i=0;i <= this.funcionarios.length; i++) {
			if(this.funcionarios[i] == null) {
				this.funcionarios[i] = f;
				break;
			}
		}		
	}
	
	public boolean livre(Funcionario f) {
		if (f == null) {
			return true;
		} else return false;
	}
	
	public void getEmpregados() {
		for(int i=0; i <= this.funcionarios.length; i++) {
			
		}
	}
}
