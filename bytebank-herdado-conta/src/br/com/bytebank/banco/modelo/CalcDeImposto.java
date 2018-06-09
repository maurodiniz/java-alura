package br.com.bytebank.banco.modelo;

public class CalcDeImposto {

	private double TotalImposto;
	
	public double getTotalImposto() {
		return TotalImposto;
	}
	
	public void registro(Tributavel t) {
			this.TotalImposto += t.getValorImposto();
	}
}
