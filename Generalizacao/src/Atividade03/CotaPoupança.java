package Atividade03;

public class CotaPoupança extends Conta {

	public CotaPoupança(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
		setSaldoPoupança(saldo);
		
	}
	
	private double saldoPoupança;

	public double getSaldoPoupança() {
		return saldoPoupança;
	}

	public void setSaldoPoupança(double saldoPoupança) {
		this.saldoPoupança = saldoPoupança;
	}

	public void depositoPoupanca(double valor) {
		if(valor != 0)
			setSaldoPoupança(getSaldoPoupança()+valor);
	}
	
	public void saquePoupanca(double valor) {
		if(valor <= getSaldoPoupança())
			setSaldoPoupança(getSaldoPoupança()-valor);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CotaPoupança [saldoPoupança=");
		builder.append(saldoPoupança);
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
