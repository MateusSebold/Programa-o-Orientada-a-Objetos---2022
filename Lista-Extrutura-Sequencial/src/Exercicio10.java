
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o primeiro N�mero Inteiro");
		int numero1 = entrada.nextInt();
		System.out.print("Insira o segundo N�mero Inteiro");
		int numero2 = entrada.nextInt();
		System.out.print("Insira o N�mero real");
		float numero3 = entrada.nextFloat();
		System.out.println("A soma do dobro do Primeiro N�mero mais a metade do segundo � " + ((numero1*2)+(numero2/2)));
		System.out.println("A soma so triplo do primeiro numero com o terceiro  � "+ ((numero1*3)+numero3));
		System.out.println("O Terceiro N�mero elevado ao cubo � "+(numero3*numero3*numero3));
		entrada.close();
	}

}