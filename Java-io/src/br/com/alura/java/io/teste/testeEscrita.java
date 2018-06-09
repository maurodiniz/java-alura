package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class testeEscrita {

	public static void main(String[] args) {
		
		try {
			// Fluxo de entrada de dados através de um arquivo.
			//	Para alterarmos o metodo de entrada para o teclado, por exemplo, usamos system.in;
			InputStream fis = new FileInputStream("fluxo_dados.txt");
			Reader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			
			// Fluxo de saida de dados através de um arquivo.
			OutputStream fos = new FileOutputStream("fluxo_saida_dados.txt");
			Writer osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			String linha = br.readLine();
			
			// Enquanto houver linha no documento, escrevo uma cópia 'bw.write(linha);', pulo a linha 'bw.newLine();' 
			// 	e leio a próxima linha 'linha = br.readLine();'.
			while(linha != null && !linha.isEmpty()) {
				bw.write(linha);
				bw.newLine();
				bw.flush();
				linha = br.readLine();
			}
			
			
//			bw.write("Olá, mundo!");
//			bw.newLine();
//			bw.write("Adeus mundo!");
			
			bw.close();
			br.close();
			
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
