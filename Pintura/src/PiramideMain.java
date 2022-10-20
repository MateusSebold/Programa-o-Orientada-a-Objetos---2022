import java.util.Scanner;

public class PiramideMain {

	public static void main(String[] args) {
		PiramideClass classe = new PiramideClass();
		Scanner entrada =  new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		
		System.out.print(" Digite o al: ");
		classe.setAb(entrada.nextFloat());
		System.out.print(" Digite a altura: ");
		classe.setAltura(entrada.nextFloat());
		System.out.print(" Digite o tipo: ");
		classe.setTipo(entrada.nextInt());
		
		builder.append("PiramideClass [ab=");
		builder.append(",\n getAb()= ");
		builder.append(classe.getAb());
		builder.append(",\n getAltura()= ");
		builder.append(classe.getAltura());
		builder.append(",\n getTipo()= ");
		builder.append(classe.getTipo());
		builder.append(",\n aL()= ");
		builder.append(classe.aL());
		builder.append(",\n areaTriangulo()= ");
		builder.append(classe.areaTriangulo());
		builder.append(",\n areaBase()= ");
		builder.append(classe.areaBase());
		builder.append(",\n areaTotal()= ");
		builder.append(classe.areaBase());
		builder.append(",\n litros()= ");
		builder.append(classe.litros());
		builder.append(",\n latas()= ");
		builder.append(classe.latas());
		builder.append(",\n preço()= ");
		builder.append(classe.preço());
		builder.append(",\n volume()= ");
		builder.append(classe.volume());
		builder.append("]");
		System.out.println(builder);
		entrada.close();

	}

}
