import java.util.Scanner;
public class Exercicio09{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual numero você gostaria de ver a tabuada?");
		int numero = entrada.nextInt();
		int TAM = 10;
		
		for (int i = 1; i<=TAM; i++)
			System.out.println(numero+ "X"+i+" ="+(i*numero) );
		
		entrada.close();

	}

}
