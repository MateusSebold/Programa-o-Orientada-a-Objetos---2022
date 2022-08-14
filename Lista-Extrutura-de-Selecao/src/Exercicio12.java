
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu Salario?");
		double salario = entrada.nextDouble();
		double salarionovo = 0;
		double percentual = 0;
		double valoraumento = 0;
		if (salario<=280) {
			percentual = 20;
			salarionovo = (salario*1.2);
			valoraumento =(salarionovo - salario);
			
		}else if ((salario>280)&&(salario<=700)) {
			percentual = 15;
			salarionovo = (salario*1.15);
			valoraumento =(salarionovo - salario);
		
		}else if ((salario>700)&&(salario<=1500)) {
			percentual = 10;
			salarionovo = (salario*1.1);
			valoraumento =(salarionovo - salario);
			
		}else  {
				percentual = 5;
				salarionovo = (salario*1.05);
				valoraumento =(salarionovo - salario);
		}
		System.out.println("Seu salario era "+salario);
		System.out.println("O percentual aplicado é "+percentual+"%");
		System.out.println("O aumento é de "+valoraumento+"R$");
		System.out.println("Seu novo salario é "+salarionovo);
		
		entrada.close();
		
			
	}

}