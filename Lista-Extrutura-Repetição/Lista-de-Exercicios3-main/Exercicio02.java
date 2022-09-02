import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String usuario = "usuario";
		String senha = "senha";		
		do {
		System.out.println("Digite seu Usuario");
		usuario = entrada.nextLine();
		System.out.println("Digite sua senha ");
		senha =  entrada.nextLine();
		if (usuario==senha);
			System.out.println("Erro");
		
		}while(usuario.equals(senha));	
		entrada.close();
}
}