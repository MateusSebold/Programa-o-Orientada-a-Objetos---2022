
import java.util.Scanner;
public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o Valor de A");
		int A = entrada.nextInt();
		System.out.print("Digite o valor de B");
		int B =  entrada.nextInt();
		System.out.print("Digite o valor de C");
		int C = entrada.nextInt();
		int delta = ((B*B)-(4*A*C));
		int x1 = (-B+delta/(2*A));
		int x2 = (-B+delta/(2*A));
		
		if (delta==0)
			System.out.println("A equação não é do segundo grau");
		
		else
			if(delta<0)
				System.out.println("A equação não possui raizes reais");
			
			else
				if(delta==0)
					System.out.println("A equação possui apenas uma raiz "+ x1);
				
				else if(delta>0)
					System.out.println(x1);
					System.out.println(x2);
		entrada.close();

}
}