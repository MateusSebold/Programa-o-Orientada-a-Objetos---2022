import java.util.Scanner;
public class Exercicio16 {
//Fa�a um programa que, dado um conjunto de N n�meros, determine o menor valor, o maior valor e a soma dos valores.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos numeros voc� quer?");
		int CON = entrada.nextInt();
		float maior = 0;
		float menor  = 1000;
		float soma = 0;	
		float numero = 0;
		
		for(int i = 1;i <= CON;i++){
		System.out.println("Digite um numero");
		numero = entrada.nextFloat();
		soma = soma+numero; 
		
		if(i == 1) {
			menor = numero;
			maior =  numero;
		
		}else if (numero < menor)
			menor = numero;
		
		else if (numero>maior)
			maior = numero;
		
	
				
		}
		entrada.close();
		System.out.println("A soma � "+soma);
		System.out.println("A menor numero � "+menor);
		System.out.println("A maior numero � "+maior);
	}

}
