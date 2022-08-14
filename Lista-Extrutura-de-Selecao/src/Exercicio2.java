
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o Numero ");
		float numero = entrada.nextFloat();
		if (numero> 0)
			System.out.println("O Numero é Positivo");
		else if(numero<0)
			System.out.println("O Numero é Negatico");
		else
			System.out.println("O Numero é Zero");
		entrada.close();
	}

}