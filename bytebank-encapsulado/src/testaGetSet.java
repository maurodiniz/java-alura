
public class testaGetSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 23905);
		
		conta.deposita(100);
		System.out.println("O saldo é de R$"+conta.getSaldo());
		
		System.out.println("O numero da Agencia é "+conta.getAgencia());
		conta.setAgencia(1337);
		System.out.println("O numero da Agencia é "+conta.getAgencia());
		
		Cliente mauro = new Cliente();
		
		conta.setTitular(mauro);
		
		// 1o jeito de setar um atributo no objeto Cliente 
		mauro.setProfissao("programador"); // usando direto a referencia 'mauro'
		//2o jeito de setar um atributo no objeto Cliente
		conta.getTitular().setProfissao("programador"); // usando a referencia 'conta'
		
		
		System.out.println(conta.getTitular().getProfissao());
	}
}
