import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva um número");
		int numero1 = input.nextInt();
		System.out.print("Escreva outro número");
		int numero2 = input.nextInt();
		System.out.println("A Soma : "+ (numero1+numero2));
		input.close();
	}

}