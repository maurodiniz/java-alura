
public class TesteCondicional {

	public static void main(String[] args) {
		System.out.println("Teste de Condicionais");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� tem menos de 18 anos mas"
								 + " pode entrar");
			} else {
				System.out.println("Voc� n�o pode entrar");
			}
		}
	}
}
