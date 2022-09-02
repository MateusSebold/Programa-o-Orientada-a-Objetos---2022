import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int TAM=10;
		int par = 0;
		int impar = 0;	
		float numero = 0;
		for (int i=1;i<=TAM;i++) {
			System.out.println("digite um numero");
			numero=entrada.nextFloat();
			
			if ((numero % 2)==0)
					par= par+1;
			
			else 
				impar = (impar+1);
		}
		System.out.println("A Quantidade de numeros pares é "+par);
		System.out.println("A quantidade de numeros impares é "+impar);
	entrada.close();
	}

}
