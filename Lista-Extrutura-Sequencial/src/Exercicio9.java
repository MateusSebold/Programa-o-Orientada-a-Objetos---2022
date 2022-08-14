import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira a Temperatura registrada em graus Fahrenheit! ");
		float fahrenheit = entrada.nextFloat();
		System.out.println("A Temperatura em Graus Celcius é " + (((fahrenheit - 32)*5)/9));
		entrada.close();
	}

}
