public class TestaBanco {

	public static void main(String[] args) {
		Cliente mauro = new Cliente();  // criei a referencia para um cliente chamado 'mauro'
		
		mauro.nome = "Mauro Diniz";       // atribuindo valores para os campos do objeto
		mauro.cpf = "111.111.111-11";
		mauro.profissao = "programador";
		mauro.salario = 2000;
		
		Conta contaMauro = new Conta();  // criei uma referencia para uma conta chamada 'contaMauro'
		contaMauro.deposita(400);
		
		contaMauro.titular = mauro;    // esse trecho que faz a ligação entre conta e titular,
									   // atribuindo todos os dados do cliente 'mauro' à 'contaMauro'
		
		System.out.println(contaMauro.titular.nome);
		
		
		
		
	}
	
}
