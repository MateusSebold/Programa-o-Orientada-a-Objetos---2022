import java.util.Scanner;
public class Exercicio17 {
	//17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
	//primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		float numero =entrada.nextFloat();
		
		if (((numero%1)==0)&&((numero%numero)==0)&&((numero%2)!=0))
			System.out.println(numero+" é primo");
			
		else
			System.out.println(numero+" não é primo");
		
		entrada.close();	
	}

}
