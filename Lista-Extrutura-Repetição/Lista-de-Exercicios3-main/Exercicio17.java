import java.util.Scanner;
public class Exercicio17 {
	//17. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero
	//primo. Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		float numero =entrada.nextFloat();
		
		if (((numero%1)==0)&&((numero%numero)==0)&&((numero%2)!=0))
			System.out.println(numero+" � primo");
			
		else
			System.out.println(numero+" n�o � primo");
		
		entrada.close();	
	}

}
