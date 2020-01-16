package aplication;


import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		int x;
		String nome,end,idade,cod;
		
		
		do {
			System.out.println("##Escolha uma das opções abaixo:##");
			System.out.println("Codigo 1: Cadastrar pessoa");
			System.out.println("Codigo 2: Imprimir cadastro");
			System.out.println("Codigo 0: Sair");
			System.out.println("------------------------------------");
			System.out.println("Digite sua opção:");
			x = sc.nextInt();
			
		switch(x) {
			case 1:
				System.out.println("Digite seu codigo:");
				cod = sc.next();
				p.setCodigo(cod);
				System.out.println("Digite seu nome:");
				nome= sc.next();
				p.setNome(nome);
				System.out.println("Digite seu endereço:");
				end=sc.next();
				p.setEndereco(end);
				System.out.println("Digite sua idade:");
				idade = sc.next();
				p.setIdade(idade);
			break;
			
			case 2:
				System.out.println("Codigo:" + p.getCodigo());
				System.out.println("Nome:" + p.getNome());
				System.out.println("Endereço:" + p.getEndereco());
				System.out.println("Idade:" + p.getIdade());	
			break;
			
			case 0:
				System.exit(0);
			break;
			
			default:
				System.out.println("## Opção invalida, tente novamente! ##");
				break;
		}
			
		}while (x!= 0);
		
		
	}

}
