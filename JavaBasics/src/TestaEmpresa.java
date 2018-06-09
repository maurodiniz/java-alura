
public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa e1 = new Empresa();
		e1.funcionarios = new Funcionario[10];
		
		e1.funcionarios[0] = new Funcionario();
		e1.funcionarios[0].nome = "Mauro";
		e1.funcionarios[0].cargo = "AAA";
		e1.funcionarios[0].salario = 0.50;
		
		e1.funcionarios[1] = new Funcionario();
		e1.funcionarios[1].nome = "Artur";
		e1.funcionarios[1].cargo = "BBB";
		e1.funcionarios[1].salario = 2000;
				
		e1.Adiciona(e1.funcionarios[0]);
		e1.Adiciona(e1.funcionarios[1]);
		
		e1.funcionarios[0].getFuncionario();
		e1.funcionarios[1].getFuncionario();
	}
}
