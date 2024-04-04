package br.com.fiap.praticando;

import java.time.LocalDate;

public class Eleitor {
	// variaveis
	private String nome;
	private int anoNasc;
	private int numTitulo;
	private int zona;
	private int secao;
	
	// construtores
	public Eleitor() {}
	
	public Eleitor(String nome, int anoNasc, int numTitulo, int zona, int secao) {
		this.nome = nome;
		setAnoNasc(anoNasc);
		this.numTitulo = numTitulo;
		this.zona = zona;
		this.secao = secao;
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		
		LocalDate anoAtual = LocalDate.now();
		
		try {
			if(anoNasc >= 1900 && anoNasc <= (anoAtual.getYear() - 16)) {
				this.anoNasc = anoNasc;
			}
			else {
				throw new Exception("Ano de nascimento fora do ano aceito para votar.");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public int getNumTitulo() {
		return numTitulo;
	}

	public void setNumTitulo(int numTitulo) {
		this.numTitulo = numTitulo;
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getSecao() {
		return secao;
	}

	public void setSecao(int secao) {
		this.secao = secao;
	}
	
}
