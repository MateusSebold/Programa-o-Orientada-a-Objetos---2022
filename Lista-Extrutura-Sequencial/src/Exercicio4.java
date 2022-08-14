import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva a Primeira nota: ");
		int nota1 = input.nextInt();
		System.out.print("Escreva a Segunda nota: ");
		int nota2 = input.nextInt();
		System.out.print("Escreva a Terceira nota: ");
		int nota3 =input.nextInt();
		System.out.print("Escreva a Quarta nota: ");
		int nota4 = input.nextInt();
		float media = (nota1 + nota2 +nota3+nota4)/4;
		System.out.println("A Media: "+ media);
		input.close();
	}

}