import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int atual = 0;
		int primeiro = 1;
		int segundo = 1;
		
		System.out.println("Ate qual termo da sequencia de Fibonacci voce quer?");
		int CON = entrada.nextInt();
		System.out.print(primeiro+"|");
		System.out.print(segundo);
		
		for(int i=1;i<=CON;i++) {
			atual = primeiro + segundo;
			primeiro = segundo;
			segundo = atual;
			System.out.print("|"+atual);
			
		}
		entrada.close();
	}

}
