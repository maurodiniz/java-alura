
public class TestaTabuada {

	public static void main(String[] args) {
		
		for (int contador = 1 ; contador < 10 ; contador++) {
			System.out.println("Tabuada do numero "+contador);
			for (int multiplicador = 1 ; multiplicador <= 10 ; multiplicador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
