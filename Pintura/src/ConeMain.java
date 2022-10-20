import java.util.Scanner;
public class ConeMain {

	public static void main(String[] args) {
		
		ConeClass classe = new ConeClass();
		Scanner entrada =  new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		
		System.out.print(" Digite o raio: ");
		classe.setRaio(entrada.nextFloat());
		System.out.print(" Digite a altura: ");
		classe.setAltura(entrada.nextFloat());
		System.out.print(" Digite o tipo: ");
		classe.setTipo(entrada.nextInt());
		
		builder.append(" ConeClass [\n raio= ");
		builder.append(classe.getRaio());
		builder.append(",\n altura= ");
		builder.append(classe.getAltura());
		builder.append(",\n tipo= ");
		builder.append(classe.getTipo());
		builder.append(",\n geratriz = ");
		builder.append(classe.geratriz());
		builder.append(",\n areaFundo = ");
		builder.append(classe.areaFundo());
		builder.append(",\n areaTotal = ");
		builder.append(classe.areaTotal());
		builder.append(",\n areaLateral = ");
		builder.append(classe.areaLateral());
		builder.append(",\n litros = ");
		builder.append(classe.litros());
		builder.append(",\n latas = ");
		builder.append(classe.latas());
		builder.append(",\n preço = ");
		builder.append(classe.preço());
		builder.append("]");
		System.out.println(builder);
		entrada.close();
	}
}
