package br.com.alura.OrdenandoListas;

public abstract class Conta { // 'abstract' serve para não podermos criar um objeto do tipo Conta, pois ele é abstrato
	protected double saldo;   // o que queremos é criar apenas contas tipo corrente e poupança.
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor recebe 2 paramentros.
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		//System.out.println("O total de contas é: "+Conta.total);
	}
	
	/**
	 * Só deve depositar se o valor for maior que zero.
	 * @param valor
	 */
	public void deposita(double valor) {
		if(valor > 0) {
			this.saldo = this.saldo + valor;
		} else{
			throw new IllegalArgumentException("não é possível depositar valores negativos!");
		}
			
		
	}
	
//	public boolean saque(double valorSaque) {
//		if (this.saldo >= valorSaque) {
//			this.saldo = this.saldo - valorSaque;
//			return true;
//		} else {
//			return false;
//		}
//			
//	}
	
	
	/**
	 * Método deve fazer o saque apenas se o saldo na conta for maior ou igual ao valor solicitado
	 * @param valorSaque
	 */
	public void saque(double valorSaque) {
		if (this.saldo < valorSaque) {
			throw new SaldoInsuficienteException("Saldo disponível: R$"+this.saldo+", Valor: R$"+valorSaque);
		} else {
			this.saldo -= valorSaque;
		}
		
		
	}
	
	/**
	 * Transfere de uma conta para outra desde que o saldo seja maior ou igual ao valor transferido.
	 * @param valorTransf
	 * @param contaDestino
	 * @return
	 */
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
	
	@Override
		public String toString() {
			return "Agencia "+this.getAgencia()+" || Numero "+this.getNumero();
		}
}