
public class TestaFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fatorial = 1;
		for (int n = 1 ; n <= 10 ; n++) {
			fatorial = fatorial * n; // poderia ser usado também a sintaxe 'fatorial *= n;'
			System.out.println("Fatorial de "+n+" é igual a "+fatorial);
		}
		
	}

}
