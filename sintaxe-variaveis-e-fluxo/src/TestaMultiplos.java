
public class TestaMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Os numeros divisíveis por 3 são");
		for (int contador = 1 ; contador <=100 ; contador++) {
			if (contador % 3 == 0) { 	// para descobrir o resto da divisão de um número por outro, usamos o '%'
				System.out.println(contador);				
			}
		}
	}

}
