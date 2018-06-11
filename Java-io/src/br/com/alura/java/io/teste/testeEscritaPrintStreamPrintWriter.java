package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class testeEscritaPrintStreamPrintWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("saida_filewriter.txt");
			
			fw.write("TESTE DE SAIDA DE DADOS USANDO O FILEWRITER");
	        fw.write(System.lineSeparator());
	        fw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

	        fw.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
