import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestaListas {

	public static void main(String[] args) {
		
		System.out.println("********* ARRAYLIST x LINKEDLIST*********");
		
		List<Integer> arrayListnumeros = new ArrayList<>();
		List<Integer> linkedListnumeros = new LinkedList<>();
		
		int qtdElementos = 1000000;
		
		long tempoArrayList  = insereElementoNo(arrayListnumeros, qtdElementos);
		long tempoLinkedList = insereElementoNo(linkedListnumeros, qtdElementos);
		
		System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
        System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
        
        tempoArrayList = removePrimeirosElementos(arrayListnumeros);
        tempoLinkedList = removePrimeirosElementos(linkedListnumeros);

        System.out.println("");
        System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
        System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
 

	}
	
	private static long removePrimeirosElementos(List<Integer> numeros) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numeros.remove(0); //removendo sempre o primeiro elemento
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long insereElementoNo(List<Integer> numeros, int quantidade) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            numeros.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }
}
