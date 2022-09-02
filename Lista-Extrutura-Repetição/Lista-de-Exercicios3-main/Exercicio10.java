import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a Base");
		int base = entrada.nextInt();
		System.out.println("didgite o expoente");
		int exp = entrada.nextInt();
		int numero = 1;
		
		for(int i=1;i<=exp;i++) {
			 numero = (numero*base);
		}
		
		System.out.println("O resultado de "+base+" elevado por "+exp+" é "+numero);
		entrada.close();
	}

}
