
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual seu sexo? digite M-masculino F-feminino");
		String sexo = entrada.nextLine();
		String masculino = "M";
		String feminino = "F";
		if (sexo.equals(masculino))
			System.out.println("M-Masculino");
			else if (sexo.equals(feminino))
				System.out.println("F-Feminino");
			else 
				System.out.println("você digitou uma Letra errada");
		
		entrada.close();
					
			
			
	}

}