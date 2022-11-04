package Atividade03;

public class CotaPoupan�a extends Conta {

	public CotaPoupan�a(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
		setSaldoPoupan�a(saldo);
		
	}
	
	private double saldoPoupan�a;

	public double getSaldoPoupan�a() {
		return saldoPoupan�a;
	}

	public void setSaldoPoupan�a(double saldoPoupan�a) {
		this.saldoPoupan�a = saldoPoupan�a;
	}

	public void depositoPoupanca(double valor) {
		if(valor != 0)
			setSaldoPoupan�a(getSaldoPoupan�a()+valor);
	}
	
	public void saquePoupanca(double valor) {
		if(valor <= getSaldoPoupan�a())
			setSaldoPoupan�a(getSaldoPoupan�a()-valor);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CotaPoupan�a [saldoPoupan�a=");
		builder.append(saldoPoupan�a);
		builder.append(", getBanco()=");
		builder.append(getBanco());
		builder.append(", getAgencia()=");
		builder.append(getAgencia());
		builder.append(", getNumeroConta()=");
		builder.append(getNumeroConta());
		builder.append("]");
		return builder.toString();
	}
}
