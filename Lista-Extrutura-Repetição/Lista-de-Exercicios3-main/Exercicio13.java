import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = entrada.nextInt();
		int K = 1;
		
		for (int i = numero; i >= 1; i--) {
			 K = (K*i);
			
		}
		System.out.println("o numero "+numero+" é igual a "+K+"fatorial");
		entrada.close();
	}
}
