package br.com.fiap.praticando;

import java.util.Scanner;

public class UseEleitor2 {

	public static void main(String[] args) {
		Eleitor eleitor1 = new Eleitor();
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite as informações do eleitor 1");
			
			System.out.print("Nome: ");
			eleitor1.setNome(scan.nextLine());
			
			System.out.print("Ano de nascimento: ");
			eleitor1.setAnoNasc(scan.nextInt());
			
			System.out.print("Número d título: ");
			eleitor1.setNumTitulo(scan.nextInt());
			
			System.out.print("Zona: ");
			eleitor1.setZona(scan.nextInt());
			
			System.out.print("Seção eleitoral: ");
			eleitor1.setSecao(scan.nextInt());
		} catch (Exception e) {
			System.out.println("Algo deu errado. Tente novamente!");
		}
		
		String nome = null;
		int anoNasc = 0, numTitulo = 0, zona = 0, secao = 0;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite as informações do eleitor 2");
			
			System.out.print("Nome: ");
			nome = scan.nextLine();
			
			System.out.print("Ano de nascimento: ");
			anoNasc = scan.nextInt();
			
			System.out.print("Número do título: ");
			numTitulo = scan.nextInt();
			
			System.out.print("Zona: ");
			zona = scan.nextInt();
			
			System.out.print("Seção eleitoral: ");
			secao = scan.nextInt();
			
		} catch (Exception e) {
			System.out.println("Algo deu errado. Tente novamente!");
		}
		
		Eleitor eleitor2 = new Eleitor(nome, anoNasc, numTitulo, zona, secao);
		
		System.out.println("------------------------------------------------");
		System.out.println("Eleitor 1");
		System.out.println(eleitor1.getNome());
		System.out.println(eleitor1.getAnoNasc());
		System.out.println(eleitor1.getNumTitulo());
		System.out.println(eleitor1.getSecao());
		System.out.println(eleitor1.getZona());
		System.out.println("------------------------------------------------");
		System.out.println("Eleitor 2");
		System.out.println(eleitor2.getNome());
		System.out.println(eleitor2.getAnoNasc());
		System.out.println(eleitor2.getNumTitulo());
		System.out.println(eleitor2.getSecao());
		System.out.println(eleitor2.getZona());
		System.out.println("------------------------------------------------");
	}

}
