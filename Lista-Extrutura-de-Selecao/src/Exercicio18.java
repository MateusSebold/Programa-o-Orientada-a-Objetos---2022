
import java.util.Scanner;
public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro lado");
		float lado1 = entrada.nextFloat();
		System.out.println("Digite o segundo lado");
		float lado2 =  entrada.nextFloat();
		System.out.println("Digite o terceiro lado");
		float lado3 =  entrada.nextFloat();
		
		if ((lado1 +lado2>lado3)||(lado1+lado3>lado2)||(lado2+lado3>lado1))
			System.out.println("os tres lados formam um triangulo");
			if ((lado1==lado2)&&(lado2==lado3))
				System.out.println("É equilatero");
				
			else if (((lado1==lado2)&&(lado2!=lado3))||((lado1==lado3)&&(lado3!=lado2))||((lado2==lado3)&&(lado3!=lado1)))
					System.out.println("é isosceles");
			
			else if (((lado1!=lado2)&&(lado2!=lado3))||((lado1!=lado3)&&(lado3!=lado2))||((lado2!=lado3)&&(lado3!=lado1)))
				System.out.println("é escaleno");
			
			else
				System.out.println("os lados digitados não formam um triângulo");
			entrada.close();		
					
	}

}