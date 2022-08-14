
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float excesso = 0;
		float multa = 0;
		System.out.print("Qual o peso?");
		float peso = entrada.nextFloat();
		
		if (peso > 50) {
			excesso = (peso-50); 
			multa = (excesso*4);
		}
		System.out.println("O peso Excedente é = " + excesso);
		System.out.println("O Valor da multa é = " + multa +"R$");
		entrada.close();
	}

}