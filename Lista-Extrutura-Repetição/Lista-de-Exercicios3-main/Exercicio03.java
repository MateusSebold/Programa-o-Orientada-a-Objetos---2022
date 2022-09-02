import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome ="A";
		int contagem = nome.length();
		int idade = 300;
		double salario = -1;
		String sexo="J";
		String m = "m";
		String f = "f";
		String s = "s";
		String c = "c";
		String v = "v";
		String d = "d";
		String estado = "J";
		
		
		
		
		Scanner entrada = new Scanner(System.in);
		while((contagem<=3)||((idade>0)&&(idade<=150))||(salario<0)||((sexo!=m)||(sexo!=f))||((estado!=s)||(estado!=v)||(estado!=c)||(estado!=d))){
			System.out.println("digite seu nome");
				nome = entrada.nextLine();
				contagem = nome.length();
				
			if (contagem<=3)
				System.out.println("Erro seu nome tem menos de 4 letras");	
			
			System.out.println("digite sua idade");
				idade = entrada.nextInt();
				
			if ((idade>0)&&(idade<=150))
				System.out.println("Sua idade é invalida");
			
			System.out.println("digite seu salario");
				salario = entrada.nextDouble();
			
			if (salario>0)
				System.out.println("salario invalido");
			
			entrada.nextLine();
			
			System.out.println("digite seu sexo");
				sexo = entrada.nextLine();
				
			if ((sexo!=m)||(sexo!=f))
				System.out.println("sexo invalido");	
			
			System.out.println("digite seu estado civil");
				estado = entrada.nextLine();
				
			if(((estado!=s)||(estado!=v)||(estado!=c)||(estado!=d)))
				System.out.println("estado civil invalido");
			
		entrada.close();	
		}
	}
}

