public class TestaMetodo {

	public static void main(String[] args) {
	
		Conta conta = new Conta();
		
		conta.saldo = 50;
		conta.deposita(1000.76);
		
		System.out.println("O saldo da conta é de "+conta.saldo);
		
		boolean tentaSaque = conta.saque(2000);
		
		if (tentaSaque == true)
			System.out.println("Saque realizado. o novo saldo é de R$"+conta.saldo);
		 else 
			System.out.println("Saldo insuficiente para saque"); 
			
		
	}	
}
