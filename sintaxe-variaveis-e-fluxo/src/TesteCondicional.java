
public class TesteCondicional {

	public static void main(String[] args) {
		System.out.println("Teste de Condicionais");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você tem menos de 18 anos mas"
								 + " pode entrar");
			} else {
				System.out.println("Você não pode entrar");
			}
		}
	}
}
