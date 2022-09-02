import java.util.Scanner;
public class Exercicio15 {
//Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float num1 = 37;
		float num2 = 38;
		float div = 1;   //dividendo
		boolean CONT = true;  //Variavel de Controle
		float produto = 0;
		while (CONT==true) {
			produto= (num1*num2)/div;
			num1 = num1 -1;
			num2 = num2 -1;
			div = div+1;
			System.out.println("("+num1+"X"+num2+")"+"/"+ div+" = "+produto);
			if ((num1==1)&&(num2==2)&&(div == 37))
				CONT=false;
		}
		entrada.close();
					
	}

}
