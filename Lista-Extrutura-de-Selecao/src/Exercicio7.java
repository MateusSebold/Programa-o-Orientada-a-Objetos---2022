import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero");
		int num1 = entrada.nextInt();
		System.out.print("Digite o segundo numero");
		int num2 = entrada.nextInt();
		System.out.print("Digite o Terceiro numero");
		int num3 = entrada.nextInt();
		int menor = 0;
		int medio = 0;
		int maior = 0;
		
		
		if ((num1<num2)&&(num1<num3))
			menor = num1; 
		else if (((num1<num2)&&(num1>num3))||((num1>num2)&&(num1<num3)))
			medio = num1;
		else if ((num1>num2)&&(num1>num3))
				maior = num1;
				
		if ((num2<num1)&&(num2<num3))
			menor = num2;
			
				else if (((num2<num1)&&(num2>num3))||((num2>num1)&&(num2<num3)))
					medio = num2;
					
				else if ((num2>num1)&&(num2>num3))
					maior = num2;
				
					
		if ((num3<num1)&&(num3<num2))
						menor = num3;
					
			else if (((num3<num1)&&(num3>num2))||((num3>num1)&&(num3<num2)))
				medio = num3;
							
				else if((num3>num1) && (num3>num2))
					maior = num3;
		System.out.println(maior);
		System.out.println(medio);
		System.out.println(menor);
		entrada.close();
		
		}
}