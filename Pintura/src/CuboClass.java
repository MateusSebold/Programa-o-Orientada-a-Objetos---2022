public class CuboClass {
	
	private float lado;
	private float rendimento;
	private int tipo;
	
	public CuboClass(float lado, float rendimento, int tipo) {
		this.lado = lado;
		this.rendimento = rendimento;
		this.tipo = tipo;
	}
	
	public float getLado() {
		return lado;
	}
	
	public float getRendimento() {
		return rendimento;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public double areaCubo() {
		return lado*lado; 
	}
	
	public double areaTotal() {
		return areaCubo()*6;
	}
	
	public double volume() {
		return Math.pow(lado, 3);
	}
	
	public double diagonalCubo() {
		return lado *Math.sqrt(3);
	}
	
	public double litrosTinta() {
		return areaTotal()/ rendimento;
	}
	
	public double latas() {
		return litrosTinta()/18;
	}
	
	public double valorTotal() {
		double preco;
		if(tipo == 1) 
	        preco = latas()*101.90; 
	    else if(tipo == 2) 
	        preco = latas()*212.45;
	    else
	        preco = latas()*345.56;
	    return(preco);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("eCuboClass [\ngetLado()=");
		builder.append(getLado());
		builder.append(", \n getRendimento()=");
		builder.append(getRendimento());
		builder.append(", \n getTipo()=");
		builder.append(getTipo());
		builder.append(", \n areaCubo()=");
		builder.append(areaCubo());
		builder.append(", \n areaTotal()=");
		builder.append(areaTotal());
		builder.append(", \n volume()=");
		builder.append(volume());
		builder.append(", \n diagonalCubo()=");
		builder.append(diagonalCubo());
		builder.append(", \n litrosTinta()=");
		builder.append(litrosTinta());
		builder.append(", \n latas()=");
		builder.append(latas());
		builder.append(", \n valorTotal()=");
		builder.append(valorTotal());
		builder.append("]");
		return builder.toString();
	}
	
	
}
