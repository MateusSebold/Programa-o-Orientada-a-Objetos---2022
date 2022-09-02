import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o menor numero");
		int menor = entrada.nextInt();
		System.out.println("informe o maior numero");
		 int maior= entrada.nextInt();
		menor = menor+1;
		
		 for (int i = menor; i <maior; i++) 
				System.out.print(i+"|");
			
		entrada.close();	
			
			}	
		
			
	}


