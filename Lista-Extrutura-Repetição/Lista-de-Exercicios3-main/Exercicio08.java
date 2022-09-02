import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o menor numero");
		int menor = entrada.nextInt();
		System.out.println("informe o maior numero");
		 int maior= entrada.nextInt();
		menor = menor+1;
		int soma = 0; 
		 for (int i = menor; i <maior; i++) { 
				System.out.print(i+"|");
				soma = soma+i;
				
		 }	
		 System.out.println("a soma dos numeros é "+soma );
		entrada.close();	
}
}
