
public class TestaMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Os numeros divis�veis por 3 s�o");
		for (int contador = 1 ; contador <=100 ; contador++) {
			if (contador % 3 == 0) { 	// para descobrir o resto da divis�o de um n�mero por outro, usamos o '%'
				System.out.println(contador);				
			}
		}
	}

}
