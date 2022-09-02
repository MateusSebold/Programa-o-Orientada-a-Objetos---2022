import java.util.Scanner; 
public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int TAM = 50;
		for (int i = 1; i <=TAM; i++) {
			if ((i%2)!=0)
				System.out.print(i+"|");
		entrada.close();
		
		}	
	}

}
