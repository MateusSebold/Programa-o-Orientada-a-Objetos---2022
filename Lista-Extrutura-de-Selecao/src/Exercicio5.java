import java.util.Scanner; 
public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada =  new Scanner(System.in);
		System.out.print(" Insira uma letra!");
		String letra = entrada.nextLine();
		String A = "A";
		String E ="E";
		String I ="I";
		String O ="O";
		String U = "U";
		
		
		if (letra.equals(A))
			System.out.println("A � vogal");
		else if (letra.equals(E))
			System.out.println("E � vogal");
		else if (letra.equals(I))
			System.out.println("I � vogal");
		else if (letra.equals(O))
			System.out.println("O � vogal");
		else if (letra.equals(U))
			System.out.println("U � vogal");
		else
			System.out.println("N�o � vogal");
		
			
		entrada.close();
			
	}

}