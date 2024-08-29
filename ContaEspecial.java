package Atividade_ContaGit;

public class ContaEspecial extends ContaBanco {

	
	private double limite = 1500;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override 
	public double sacar(double sacar) {	
		if(sacar<0) {
			System.out.println("Valor de saque deve ser positivo");
			return 0;
		}
		if(sacar > this.limite) {
			System.out.println("SAQUE NÂO PERMITIDO!");
		} else if (sacar <= getSaldo() && getSaldo() > 0) {
			setSaldo(this.getSaldo() -  sacar);
			this.limite -= sacar;
			System.out.println("Saque de R$" + sacar + " realizado.");
		} else {
			System.out.println("SALDO INSUFICIENTE!");
		}
		return this.getSaldo();
		
	}
	
	public ContaEspecial(String nomeCliente, double limite) {
		super(nomeCliente);
		this.limite = limite;
	}
}
