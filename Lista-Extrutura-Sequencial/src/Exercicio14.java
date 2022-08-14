
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
			System.out.print("Quanto você ganha por hora?");
			float ganhohora = entrada.nextFloat();
			System.out
			.print("Quantas horas você trabalha por mês?");
			float horatrabalhada = entrada.nextFloat();
			double salariobruto = (horatrabalhada*ganhohora);
			double inss = salariobruto*0.08;
			double sindicato = salariobruto*0.05;
			double ir = salariobruto*0.11; //Imposto de Renda
			double salarioliquido = salariobruto - inss - sindicato - ir;
			System.out.println("Salario Bruto = "+ salariobruto);
			System.out.println("Imposto de Renda = "+ ir);
			System.out.println("INSS = "+ inss);
			System.out.println("Valor do Sindicato = " + sindicato);
			System.out.println("Salario Liquido = "+ salarioliquido);
			entrada.close();
			
		
	}

}