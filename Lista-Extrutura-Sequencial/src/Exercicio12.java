
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" Qual seu sexo? 1-masculino,2-feminino");
		int sexo = entrada.nextInt();
		System.out.println("Qual sua altura?");
		float altura = entrada.nextFloat();
		if (sexo ==1) {
			System.out.println("Sua altura Ideal é "+ ((altura*72.7)-58));
		}	
		else {
			System.out.println("Sua altura Ideal é "+ ((altura*62.1)-44.7));
		}
		
		entrada.close();
	}

}