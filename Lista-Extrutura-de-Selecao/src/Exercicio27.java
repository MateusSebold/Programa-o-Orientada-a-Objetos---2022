
import java.util.Scanner;
public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero");
		int num2 = entrada.nextInt();
		System.out.println("Escolha a operação! 1-adição,2-subtração,3-multiplicação,4-divisão)");
		int operação = entrada.nextInt();
		int resultado = 0;
				
		if (operação==1) 
			  resultado = num1 +num2;
			
		else if(operação==2) 
			  resultado = num1 - num2;
		
		else if(operação==3)
			resultado = num1*num2;
		
		else
			resultado = num1/num2;
		
		System.out.println(resultado);
	
		if ((resultado%2)==0)
			System.out.println("Par");
		else 
			System.out.println("Impar");
		
		if (resultado>0)
			System.out.println("Positivo");
		else 
			System.out.println("Negativo");
		
		entrada.close();	
		
		entrada.close();
}
}