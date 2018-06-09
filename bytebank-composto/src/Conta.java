public class Conta {
	double saldo;
	int agencia;
	Cliente titular;
	
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
	
}