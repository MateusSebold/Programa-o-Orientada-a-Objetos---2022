import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero");
		int numero = entrada.nextInt();
		
		if ((numero%2)==0)
			System.out.println(numero + 1);
		else if ((numero%2)!=0)
			System.out.println(numero+1);
		
		entrada.close();
	}

}