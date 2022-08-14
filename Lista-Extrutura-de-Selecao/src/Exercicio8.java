
import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primerira Nota");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a segunda Nota");
		float nota2 = entrada.nextFloat();
		float media = ((nota1+nota2)/2);
		if (media >= 7)
			System.out.println("Aprovado");
		else 
			System.out.println("Reprovado");
		
		entrada.close();
		

	}

}