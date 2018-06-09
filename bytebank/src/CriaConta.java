

public class CriaConta {

	public static void main(String[] args) {
		Conta PrimeiraConta = new Conta();
		
		PrimeiraConta.saldo = 200;
		//System.out.println("O saldo é de "+PrimeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		System.out.println("O saldo da 1a conta é "+PrimeiraConta.saldo);
		System.out.println("O saldo da 2a conta é "+segundaConta.saldo);
		
		if (PrimeiraConta.transfere(300, segundaConta)) {
			System.out.println("Transferencia feita com sucesso!");
			System.out.println("O novo saldo da 1a conta é "+PrimeiraConta.saldo);
			System.out.println("O novo saldo da 2a conta é "+segundaConta.saldo);
		} else
			System.out.println("Saldo insuficiente");
		

	}
}
