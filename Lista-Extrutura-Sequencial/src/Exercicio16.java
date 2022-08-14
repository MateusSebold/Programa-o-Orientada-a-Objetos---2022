
import java.util.Scanner; 
public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual a Área em metros quadrados a ser pintada?");
		float area = entrada.nextFloat(); 
		float latas = (area/6)/18;
		double galoes = (area/6)/3.6;
		double custolatas = (latas*80);
		double custogaloes = (galoes*25);
		System.out.println("A quantidade de galões a serem comprados é "+galoes+"e o custo é de "+custogaloes);
		System.out.println("A quantidade de latas a serem comprados é "+latas+"e o custo é de "+custolatas);
		entrada.close();
	}

}