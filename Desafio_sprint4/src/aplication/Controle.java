package aplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Pessoa;

public class Controle {
	
	
	public void gravaDados(Pessoa pessoa) throws IOException {
		FileWriter fw = new FileWriter("pessoas.txt", true);
		fw.write(pessoa.toSave());
		fw.write(System.lineSeparator());
		fw.close();
	}
	
	public void getDados() {
		
		Pessoa p = new Pessoa();
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		
		try {
			Scanner sc = new Scanner(new File("pessoas.txt"));
			
			while(sc.hasNext()) {
				String linha = sc.nextLine();
				
				Scanner sc1 = new Scanner(linha);
				sc1.useDelimiter(",");

				p = new Pessoa();
				p.setCodigo(sc1.next());
				p.setNome(sc1.next());
				p.setEndereco(sc1.next());
				p.setIdade(sc1.next());
				
				lista.add(p);
				sc1.close();
			}
			
			System.out.println(lista);
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		
		
	}
	
	
}
	



	

