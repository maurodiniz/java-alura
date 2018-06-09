public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		System.out.println("O total de contas é: "+Conta.total);
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saque(double valorSaque) {
		if (this.saldo >= valorSaque) {
			this.saldo = this.saldo - valorSaque;
			return true;
		} else {
			return false;
		}
			
	}
	
	public boolean transfere (double valorTransf, Conta contaDestino) {
		if (this.saldo >= valorTransf) {
			this.saldo -= valorTransf;
			contaDestino.deposita(valorTransf);
			return true;
		} else
			return false;
	} 
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int newAgencia) {
		this.agencia = newAgencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero( int newNumero) {
		this.numero = newNumero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() { // declaro esse metodo como estatico para poder ser chamado em outras classes.
		return Conta.total;		   // comparando com delphi, o static meio que torna o metodo como global.	
	}
	
}