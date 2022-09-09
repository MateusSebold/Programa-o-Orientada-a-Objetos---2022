
public class FuncaoClasse {
	
	public static double Exercicio3(double argumento1, double argumento2, double argumento3) {
		double soma = (argumento1 + argumento2 + argumento3);
		return soma;
	}
	
	public static String Exercicio4( int numero) {
		if (numero >0)
			return "P";
		else
			return "N";
	}
	
	public static double somaImposto(int valor,int taxaImposto) {
		double operacao = ((valor*(taxaImposto+100))/100);
		return operacao;
		
	}
	
	public static String Exercicio6(int horas, int minutos ) {
		String saida;
		if(horas>12) {
			horas = horas - 12;
			 saida = horas +":"+minutos +" PM";
		}
		else
			saida = horas +":"+minutos +" AM";
			
		return saida;
	}
	
	public static String Exercicio07(float conta, int dias) {
		StringBuilder stri = new StringBuilder();
		do {
			if(conta ==0) {
				
			}
			else {
				double resultado = ((conta*(103+(0.3*dias)))/100);
				String res = resultado;
				return resultado;
			}
			
		}while(conta ==0);
		
	}
}
