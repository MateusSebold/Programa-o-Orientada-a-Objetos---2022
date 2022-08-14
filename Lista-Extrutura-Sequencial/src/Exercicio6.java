import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um raio: ");
		float raio = input.nextFloat();
		System.out.println("A Area e; "+((raio*raio)*3.14));
		input.close();
	}

}
