
import java.util.Scanner; 
public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual a �rea em metros quadrados a ser pintada?");
		float area = entrada.nextFloat(); 
		float latas = (area/6)/18;
		double galoes = (area/6)/3.6;
		double custolatas = (latas*80);
		double custogaloes = (galoes*25);
		System.out.println("A quantidade de gal�es a serem comprados � "+galoes+"e o custo � de "+custogaloes);
		System.out.println("A quantidade de latas a serem comprados � "+latas+"e o custo � de "+custolatas);
		entrada.close();
	}

}