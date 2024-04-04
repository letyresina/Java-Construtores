package br.com.fiap.praticando;

public class UseEleitor {
	public static void main(String[] args) {
		Eleitor eleitor1 = new Eleitor("Leticia Resina", 2004, 1001, 10, 4);
		System.out.println(eleitor1.getNome());
		System.out.println(eleitor1.getAnoNasc());
		System.out.println(eleitor1.getNumTitulo());
		System.out.println(eleitor1.getSecao());
		System.out.println(eleitor1.getZona());
	}
}
