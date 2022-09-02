import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float nota = 20;
		
		do {
			System.out.println("Digite uma nota de 0 a 10");
			  nota = entrada.nextFloat();
		
		}while((nota<0)||(nota>10));
		
		entrada.close();
		
	}

}
