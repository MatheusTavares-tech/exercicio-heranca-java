package Atividade_ContaGit;

import java.util.Calendar;

public class ContaPoupanca extends ContaBanco {

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	Calendar dia = Calendar.getInstance();

	public double calcularNovoSaldo(double percentual) {
		if (diaRendimento == dia.get(Calendar.DAY_OF_MONTH)) {

			this.setSaldo (this.getSaldo() * (percentual / 100) + this.getSaldo());
			System.out.println("Saldo com reajuste: " + this.getSaldo());
		} else {
			System.out.println("Sem rendimento!"); 
		}
		return this.getSaldo();
		
	}

	public ContaPoupanca(String nomeCliente, int diaRendimento) {
		super(nomeCliente);
		this.diaRendimento = diaRendimento;
	}

}
