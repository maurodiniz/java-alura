package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class testeEscritaFileWriter {

	public static void main(String[] args) {
		
		try {
			long i = System.currentTimeMillis();
			
			PrintStream ps = new PrintStream("saida_PrintStream.txt");
			
			ps.print("TESTE DE SAIDA DE DADOS USANDO O PRINTSTREAM");
	        ps.println();
	        ps.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

	        ps.close();
	        
	        PrintWriter pw = new PrintWriter("saida_PrintWriter.txt");

	        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	        pw.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

	        pw.close();
	        
	        long f = System.currentTimeMillis();
	        System.out.println("Demorou "+(f-i)+"ms para a saida dos arquivos ser completada!");
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
