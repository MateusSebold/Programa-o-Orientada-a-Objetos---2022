
import java.util.Scanner;
public class Exercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("telefonou para vitima 1-Sim,2-Não");
		int p1 = entrada.nextInt();
		System.out.println("esteve no local do crime 1-Sim,2-Não");
		int p2 = entrada.nextInt();
		System.out.println("mora perto da vitima 1-Sim,2-Não");
		int p3 = entrada.nextInt();
		System.out.println("devia para a vitima 1-Sim,2-Não");
		int p4 = entrada.nextInt();
		System.out.println("ja trabalhou com a vitima 1-Sim,2-Não");
		int p5 = entrada.nextInt();
		int k = 0;
				
		if (p1==1)
			k = k+1;
		
		else if(p2==1)
			k = k+1;
		
		else if(p3==1)
			k = k+1;
		
	
		else if(p4==1)
			k = k+1;
		
		else if(p5==1)
			k=k+1;
		
		if(k==2)
			System.out.println("Suspeito");
		
		else if((k==3)||(k==4))
			System.out.println("Cumplice");
			
			else if(k==5)
				System.out.println("Assassino");
			
			else if(k<2)
				System.out.println("Inocente");
			
		entrada.close();
		
	}

}