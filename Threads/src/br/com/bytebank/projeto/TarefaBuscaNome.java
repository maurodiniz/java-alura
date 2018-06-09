package br.com.bytebank.projeto;

import java.io.File;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable {

	private String nomeArquivo;
	private String nome;
	
	public TarefaBuscaNome(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
	}
	
	@Override
	public void run() {
		try {			
			Scanner scanner = new Scanner(new File(nomeArquivo));
			
			boolean achou = false;
			int numLinha = 1;
			
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if(linha.contains(nome)) {
					System.out.println(nomeArquivo+" - Linha: "+numLinha+" - "+linha);
					achou = true;
				}
				
				numLinha++;
			}
			if(achou != true) {
				System.out.println("Nenhum Registro encontrado!");
			}
			scanner.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		
		
	}

}
