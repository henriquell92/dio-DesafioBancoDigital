package BancoDigital;

public class Main {

	public static void main(String[] args) {
		
		Cliente henrique = new Cliente();
		henrique.setNome("Henrique");
		
		Conta cc = new ContaCorrente(henrique);
		Conta poupanca = new ContaPoupanca(henrique);
		
		cc.depositar(150);
		cc.transferir(90, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
