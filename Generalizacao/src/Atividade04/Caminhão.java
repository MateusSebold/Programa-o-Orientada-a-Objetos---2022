package Atividade04;

public class Caminhão extends Veiculo {

	public Caminhão(boolean motor) {
		super(motor);
		
	}
	
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Caminhão [eixos=");
		builder.append(eixos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
