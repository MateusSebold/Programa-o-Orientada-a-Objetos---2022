
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Em que turno você estuda? M-Matutino,V-vespertino,N-Noturno");
		String periodo = entrada.nextLine();
		String M = "M";
		String V = "V";
		
		
		if(periodo.equals(M))
			System.out.println("Bom Dia");
		else if(periodo.equals(V))
			System.out.println("Boa Tarde");
		else 
			System.out.println("Boa Noite");
		
		entrada.close();
		
	}

}