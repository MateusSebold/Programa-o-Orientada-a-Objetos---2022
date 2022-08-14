import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiuro lado: ");
		float lado1 = input.nextFloat();
		System.out.println("Digite o Segundo Lado: ");
		float lado2 = input.nextFloat();
		System.out.println("Estaq e a area do cavalo: "+lado1*lado2);
		input.close();
	}

}
