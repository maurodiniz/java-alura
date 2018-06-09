
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario mauro = new Funcionario();
		
		mauro.setNome("Mauro Diniz");
		mauro.setCPF("123.456.789-0");
		mauro.setSalario(10000);
		
		System.out.println(mauro.getNome());
		System.out.println(mauro.getCPF());
		System.out.println(mauro.getSalario());
		System.out.println("A bonificação desse funcionário é de R$"+mauro.getBonificacao());
	}
}
