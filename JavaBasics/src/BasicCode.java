
public class BasicCode {

	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println(gastosTrimestre);
		int mediaMensal = gastosTrimestre/3;
		System.out.println(mediaMensal);
		
//		int i = 150;
//		while (i>=150 && i<300) {
//			System.out.println(i);
//			i++;
//		}
		
//		int soma = 0;
//		int i = 1;
//		
//		while(i<=1000) {
//			soma = soma+i;
//			i++;			
//		}
//		System.out.println("valor da soma: "+soma);
		

		for(int i=1; i <=100;i++) {
			System.out.println(i*3);
		}
		
		long fatorial = 1;
		for(int n =1; n <=10;n++) {
			fatorial = fatorial * n;
			System.out.println("o fatorial de "+n+" é: "+fatorial);
		}
		
		
		int x = 13;
		System.out.print(x);
		while(x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x+1;
			}
			System.out.print(">"+x);
		}
	}
}
