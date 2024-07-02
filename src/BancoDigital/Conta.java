package BancoDigital;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int numeroConta;
	protected int numeroAgencia;
	protected double saldo;
	protected Cliente cliente;
	


	public Conta(Cliente cliente) {
		this.numeroAgencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	
	protected void imprimirInfosComuns() {
	System.out.println(String.format("Titular: %s" , this.cliente.getNome()));
	System.out.println(String.format("Agencia: %d" , this.numeroAgencia));
	System.out.println(String.format("Conta: %d" , this.numeroConta));
	System.out.println(String.format("Saldo: %.2f" , this.saldo));
	}
	
	
	

}
