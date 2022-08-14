
import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primerira Nota");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a segunda Nota");
		float nota2 = entrada.nextFloat();
		float media = ((nota1+nota2)/2);
		String conceito="Z";
		if ((media>=9)&&(media<=10))
			conceito="A";
			else if ((media>=7.5)&&(media<9))
				conceito="B";
		
			else if((media>=6)&&(media<7.5))
				conceito="C";
		
			else if ((media>=4)&&(media<6))
				conceito="D";
			else if ((media>=0)&&(media<4))
				conceito="E";
		if((conceito=="A")||(conceito=="B")||(conceito=="C"))
			System.out.println("APROVADO");
		else 
			System.out.println("REPROVADO");
		entrada.close();
	}
}