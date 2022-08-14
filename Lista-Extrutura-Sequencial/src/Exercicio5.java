import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva uma medida em metros; ");
		float medida = input.nextFloat();
		System.out.println("A medida em centimetro e: "+(medida*100));
		input.close();
		
	}

}
