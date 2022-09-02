import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double PA = 80000;
		double PB = 200000;
		int K = 0;
		while(PA<PB) {
			K = K+1;
			PA = PA * 1.03;
			PB = PB * 1.015;
			if (PA>=PB)
				System.out.println("A Cidade A levou "+K+" anos para superar a população da cidade B");
		}
		entrada.close();
	}

}
