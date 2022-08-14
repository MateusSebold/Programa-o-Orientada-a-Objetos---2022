
import java.util.Scanner;
public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Dia");
		int dia = entrada.nextInt();
		System.out.println("Digite o mês");
		int mes = entrada.nextInt();
		System.out.println("Digite o ano");
		int ano = entrada.nextInt();
		
		if ((dia>0 && dia<=30)&&(mes>0 && dia<=12)&&(ano<=2021))
			System.out.print(dia+"/"+mes+"/"+ano+ "é valido");
		else
			System.out.print(dia+"/"+mes+"/"+ano+ " é invalido");
		entrada.close();
	}

}