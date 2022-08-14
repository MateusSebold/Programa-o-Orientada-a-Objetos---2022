import java.util.Scanner;
public class Exercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primerira Nota");
		float nota1 = entrada.nextFloat();
		System.out.print("Digite a segunda Nota");
		float nota2 = entrada.nextFloat();
		System.out.println("Digite a teceira nota");
		float nota3 = entrada.nextFloat();
		float media = ((nota1+nota2+nota3)/3);
		if (media == 10)
			System.out.println(media+" Aprovado com Distinção");
		else if(media>=7)
			System.out.println(media+" Aprovado");
		else if (media<7)
			System.out.println(media+" Reprovado");
		
		entrada.close();
		
}
}
