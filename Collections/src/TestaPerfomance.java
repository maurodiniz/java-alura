import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {

	// ********* LISTAS x SETS*********
	// 		TESTE DE PERFOMANCE
	
	public static void main(String[] args) {
		
		Collection<Integer> numeros = new HashSet<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i <=150000; i++) {
			numeros.add(i);
		}
		
		for (Integer contemNumero : numeros) {
			numeros.contains(contemNumero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoTotal = fim - inicio;
		
		System.out.println("O tempo gasto foi de "+tempoTotal+"ms");
		
		// RESULTADO: Enquanto o tempo médio usando 150.000,00 elementos foi de 10000ms nas Listas,
		//            nos HashSets foi de 45ms. Uma diferença brutal que inviabiliza o uso de Listas para esse tipo de uso.
	}
}
