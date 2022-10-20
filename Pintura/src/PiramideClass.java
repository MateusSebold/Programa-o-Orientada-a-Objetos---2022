
public class PiramideClass {
	
	private float ab;
	private float altura;
	private int tipo;
	
	public float getAb() {
		return ab;
	}

	public void setAb(float raio) {
		this.ab = raio;
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public double aL() {
		return Math.sqrt((ab*ab)+(altura*altura));
	}
	
	public double cd() {
		return ab*2;
	}
	
	public double areaTriangulo() {
		return (cd()*aL())/2;
	}
	
	public double areaBase() {
		return Math.pow(cd(), 2);
	}
	
	public double areaTotal() {
		return areaTriangulo()*4 + areaBase();
	}
	
	public double litros() {
		return areaTotal()/4.76;
	}
	
	public double latas() {
		return Math.ceil(litros()/18); 
	}
	
	public double preço() {
		double preco;
		if(tipo == 1) 
	        preco = latas()*127.90; 
	    else if(tipo == 2) 
	        preco = latas()*258.98;
	    else
	        preco = latas()*344.34;
	    return(preco);
	}
	
	public double volume() {
		return (areaBase()*altura )/3;
	}
	
	
}
