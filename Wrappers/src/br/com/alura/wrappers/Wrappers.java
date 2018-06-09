package br.com.alura.wrappers;

import java.util.ArrayList;

public class Wrappers {

	public static void main(String[] args) {	
	
	/* PARA TODO TIPO PRIMITIVO (int, double, char, boolean, etc) EXISTE UM OBJETO QUE REPRESENTA ESSE TIPO.
	 * AO CRIARMOS UMA LISTA, POR EXEMPLO, E ADICIONARMOS UM ELEMENTO PRIMITIVO DENTRO O JAVA AUTOMATICAMENTE FAZ
	 * O PROCESSO CHAMADO DE 'AUTOBOXING', QUE TRANSFORMA ESSE PRIMITIVO EM UMA REFERENCIA E ADICIONA NA LISTA, J� QUE 
	 * AS LISTAS ARMAZENAM APENAS OBJETOS.
	 * SEGUEM ALGUNS EXEMPLOS ABAIXO:  
	 */ 
	
	int idade = 29;
	Integer refIdade = Integer.valueOf(idade); // Aqui est� um exemplo de 'empacotamento', pois peguei uma variavel primitiva do tipo int e transformei em uma referencia atrav�s da classe Integer;
	
	Integer refIdade2 = new Integer(idade);	   // Temos aqui outra maneira de transformar uma variavel primitiva em referencia, por�m esse m�todo n�o � recomendado	devido � ser considerada m� pratica.
	
	System.out.println(refIdade);
	System.out.println(refIdade2);
	
	// Usando a pr�pria classe Integer podemos usar algumas constantes, como por exemplo, os valores minimos e m�ximos
	//	que o tipo Integer suporta.
	System.out.println("O valor m�ximo de um n�mero inteiro �: "+Integer.MAX_VALUE);
	System.out.println("O valor m�nimo de um n�mero inteiro �: "+Integer.MIN_VALUE);
	
	// Esse processo � o inverso do empacotamento, pois peguei uma referencia e transferi seu conteudo para uma 
	//	vari�vel primitiva. Isso � chamado de UNBOXING;
	int valor = refIdade.intValue(); 
	
	System.out.println(valor);
	
	// Aqui criei uma lista de Strings e adicionei o valor '10' como string
	ArrayList<String> Lista1 = new ArrayList<String>();
	Lista1.add("10"); 
	//Para acessar esse valor '10' e coloc�-lo em uma vari�vel tipo Integer usamos o comando 'parseInt' da classe Integer:
	int valor2 = Integer.parseInt(Lista1.get(0));
	System.out.println(valor2);
	
	// Aqui criei uma lista de inteiros, e usei essas 2 formas de inser��o para mostrar que o Java faz automaticamente
	// o autoboxing. Essa lista s� aceita refer�ncias do tipo Integer, oprtanto o comando 'lista2.add(29)' n�o deveria
	// funcionar.
	// O Java pegou esse valor primitivo e automaticamente transformou em uma referencia para ser armazenada na lista.
	ArrayList<Integer> lista2 = new ArrayList<Integer>();
	lista2.add(29);
	lista2.add(Integer.valueOf(refIdade2));
	
	// Aui temos um exemplo de polimorfia para mostrar que a classe Number � a classe m�e de todos esses tipos num�ricos
	// que temos (Integer, Double, Float, Long, Short e Byte).
	Number refNumero = Double.valueOf(3.46);
	
	
	}
}
