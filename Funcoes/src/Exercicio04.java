import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		
		System.out.println(FuncaoClasse.Exercicio4(entrada.nextInt()));
		entrada.close();
	}

}
