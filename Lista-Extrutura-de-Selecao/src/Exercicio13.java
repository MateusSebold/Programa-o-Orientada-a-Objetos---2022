import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor pago por hora?");
		double valor = entrada.nextDouble();
		System.out.println("Quantidade de horas trabalhadas/mês");
		double horas = entrada.nextDouble();
		double salariobruto = (valor*horas);
		double ir = 0;
		double inss = 0;
		double fgts = 0;
		double sindicato = 0;
		double TD = 0;
		double salario = 0;
		
		if (salario<=900)
		{
			inss = salariobruto*0.1;
			ir = salariobruto* 0;
			fgts = salariobruto*0.11;
			sindicato = salariobruto*0.03;
			TD = inss + fgts +sindicato;
			salario = salariobruto - TD;
		}
			
		 else if((salario>900) && (salario<=1500))
			{
				ir = salariobruto*0.05;
				inss = salariobruto*0.1;
				fgts = salariobruto*0.11;
				sindicato = salariobruto*0.03;
				TD = inss + fgts +sindicato+ir;
				salario = salariobruto - TD;
			}	
		else if((salario>1500) && (salario<=2500))
			{
				ir = salariobruto*0.1;
				inss = salariobruto*0.1;
				fgts = salariobruto*0.11;
				sindicato = salariobruto*0.03;
				TD = inss + fgts +sindicato+ir;
				salario = salariobruto - TD;
			}
				else 
				{
					ir = salariobruto*0.2;
					inss = salariobruto*0.1;
					fgts = salariobruto*0.11;
					sindicato = salariobruto*0.03;
					TD = inss + fgts +sindicato+ir;
					salario = salariobruto - TD;
				}
			System.out.println("R$ "+salariobruto);
			System.out.println("R$ -"+ir);
			System.out.println("R$ -"+inss);
			System.out.println("R$ -"+fgts);
			System.out.println("R$ -"+sindicato);
			System.out.println("R$ -"+TD);
			System.out.println("R$ "+salario);
			entrada.close();
			}

	}
