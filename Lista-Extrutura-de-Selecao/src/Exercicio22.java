
import java.util.Scanner;
public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada =  new Scanner(System.in);
		System.out.println("Digite um Numero menor que 1000");
		int numero = entrada.nextInt();
		
		if((numero<1000)&&(numero>100)) {
			int centena = (numero / 100);
			System.out.println(centena+" centenas");
			int dezena = ((numero - (centena*100))/10);
			System.out.println(dezena+" dezenas");
			int unidade = (((numero - (centena*100))-(dezena*10))/1);
			System.out.println(unidade+" unidade");
		
		}
		else
			System.out.println("ERRO! O numero não é uma centena");
		
		entrada.close();
	}

}