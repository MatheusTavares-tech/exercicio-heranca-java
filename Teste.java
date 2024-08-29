package Atividade_ContaGit;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaEspecial c1 = new ContaEspecial("Matheus Tavares", 1500);
		System.out.println("-----Conta Especial-----");
		c1.depositar(10000);
		c1.sacar(1500);
		System.out.println(c1);
		
		
		ContaPoupanca c2 = new ContaPoupanca("Jozin", 29);
		System.out.println("-----Conta Poupança----");
		c2.depositar(1000);
		c2.sacar(500);
		
		c2.calcularNovoSaldo(10);
		System.out.println(c2);
		
	}

}
