import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome:");
		String nome = sc.nextLine();
		
		System.out.println("Número de horas trabalhadas:");
		int numHoras = sc.nextInt();
		
		System.out.println("Número de dependências:");
		int dependencias = sc.nextInt();
		
		final double VALOR_HORA = 32.00;
		final double VALOR_DEPENDENTE = 40.00;
	
		//Calcula o salário bruto
		double salarioBruto = ((numHoras * VALOR_HORA) + (dependencias * VALOR_DEPENDENTE));
		
		//Calcula o INSS
		double inss = salarioBruto * (8.5/100);
		
		//Calcula o IR
		double ir = salarioBruto * (5.0/100);
		
		//Salário líquido 
		double liquido = (salarioBruto - inss - ir);
		
		System.out.println("------------------------------------");
		System.out.println("-----------Ficha-de-dados-----------");
		System.out.println("------------------------------------");
		System.out.println("-> Nome: "+nome);
		System.out.println("-> Número de horas trabalhadas: "+numHoras);
		System.out.println("-> Núemro de dependências: "+dependencias);
		System.out.println("------------------------------------");
		System.out.println("-> Salário Bruto: "+salarioBruto);
		System.out.println("-> INSS: "+inss);
		System.out.println("-> IR: "+ir);
		System.out.println("-> Salário Líquido: "+liquido);
		System.out.println("------------------------------------");
		
		sc.close();
	}

}
