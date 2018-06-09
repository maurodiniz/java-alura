package br.com.bytebank.banco.teste;

public class TesteErro {

	public static void main(String[] args) {
		
		System.out.println("Inicio main");
		m1();
		System.out.println("Fim main");
	}

	private static void m1() {
		System.out.println("inicio m1");
		m2();
		System.out.println("fim m1");
		
	}
	
	private static void m2() {
		System.out.println("inicio m2");
		
		int[] array = new int[5];
		try {
			for(int i=1; i <=10; i++) {
				array[i] = (i*2);
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("fim m2");
	}
}
