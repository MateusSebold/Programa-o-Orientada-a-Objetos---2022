
import java.util.Scanner;
public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira idade");
		int idade1 = entrada.nextInt();
		System.out.println("Digite a segunda entrada");
		int idade2 = entrada.nextInt();
		System.out.println("Digite a terceira entrada");
		int idade3 = entrada.nextInt();
		int media  = (idade1+idade2+idade3)/3;
		
		if (media<25)
			System.out.println("Turma Jovem");
		else if((media>=25)&&(media<=40))
			System.out.println("Turma Adulta");
		else 
			System.out.println("Turma Idosa");
		
		entrada.close();
		
	}

}