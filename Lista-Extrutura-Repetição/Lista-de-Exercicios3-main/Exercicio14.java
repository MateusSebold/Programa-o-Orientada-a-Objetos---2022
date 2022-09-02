import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ate que termo você quer ver");
		int TER = entrada.nextInt();
		int m= 1;
		int n= 1;
			
		System.out.println(m+"/"+n);		
		
		for(int i = 2;i <= TER;i++){
			m = m+1;
			n = n+2;
			System.out.println(m+"/"+n);
			
		}
		entrada.close();
	}

}
