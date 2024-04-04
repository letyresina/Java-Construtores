package br.com.fiap.praticando;

public class ContaPoupanca {
	// variaveis
	private int numConta;
	private String donoConta;
	private float saldoConta;
	
	// construtores
	public ContaPoupanca() {}
	
	public ContaPoupanca(String donoConta, int numConta, float saldoConta) {
		this.donoConta = donoConta;
		this.numConta = numConta;
		setSaldoConta(saldoConta);
	}

	//getters e setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getDonoConta() {
		return donoConta;
	}

	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		try {
			if (saldoConta >= 0) {
				this.saldoConta = saldoConta;
			}
			else {
				throw new Exception("O saldo na conta deve ser maior que 0.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// metódos
	public void realizaSaque(float valorSaque) {
		try {
			if (valorSaque <= saldoConta) {
				saldoConta = saldoConta - valorSaque;
				System.out.println("O saldo atual é de " + saldoConta);
			}
			else {
				throw new Exception("O saque não pode ser maior que o valor atual");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void realizaDeposito(float valorDeposito) {
		try {
			if (valorDeposito > 0) {
				saldoConta = saldoConta + valorDeposito;
			}
			else {
				throw new Exception("O depósito deve ser maior que 0");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
