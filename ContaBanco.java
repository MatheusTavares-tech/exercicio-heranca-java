package Atividade_ContaGit;

public class ContaBanco {

	private int numConta;
	private double saldo;
	private String nomeCliente;
	
	//Métodos especiais
	
	public void setSaldo(double newSaldo) {
		this.saldo = newSaldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setNumConta(int novoNumConta) {
		this.numConta = novoNumConta;
	}
	public int getNumConta() {
		return this.numConta;
	}
	
	
	//Regra de negocios (Metodos)
	public double depositar(double deposito) {
		this.saldo += deposito;
		System.out.println("Deposito realizado: " + this.saldo);
		return this.saldo;
	}
	
	public double sacar(double sacar) { //Saldo nao pode ser negativo
		if(sacar<0) {
			System.out.println("Valor de saque deve ser positivo");
			return 0;
		}
		if(sacar <= this.saldo  && this.saldo > 0) {
			this.saldo -= sacar;
			System.out.println("Saque de R$ " + sacar+ " realizado." );
			return this.saldo;
		}
			System.out.println("Saldo Insuficiente!");
			return 0;
	 	
	}
	//Construtor
	public ContaBanco(String nomeCliente) {
		this.saldo = 0;
		this.nomeCliente = nomeCliente;
		//Gerador de numero aleatorio
		this.numConta = (int)(Math.random() * 10000) + 1000;
	}
	
	
	
	@Override
	public String toString() {
		return "Titular da conta: " + this.nomeCliente +
				"\n Número da conta: " + this.numConta + 
				"\nSaldo Atual: R$ " + this.saldo;
	}
	
	
	
	
}












