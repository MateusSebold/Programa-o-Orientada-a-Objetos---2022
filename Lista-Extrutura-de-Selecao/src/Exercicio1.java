import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro N�mero");
		float numero1 = entrada.nextFloat();
		System.out.print("Digite o segundo N�mero");
		float numero2 = entrada.nextFloat();
		if (numero1>numero2)
			System.out.println("O numero"+ numero1 +"� o maior");
		
		else
			System.out.println("O numero"+ numero2 +"� o maior");
		entrada.close();
	}

}