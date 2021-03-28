import java.util.Scanner;

public class Exercicio002 {
	
	public static void main(String[] args) {
		
		double V1, V2, V3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número 1:");
		V1 = sc.nextDouble();
		
		System.out.println("Digite o número 2:");
		V2 = sc.nextDouble();
		
		System.out.println("Digite o número 3:");
		V3 = sc.nextDouble();
		
		System.out.println("Operação 1: "+(V1 + V2));
		System.out.println("Operação 2: "+(V2 - V1));
		System.out.println("Operação 3: "+(V3 * V1));
		System.out.println("Operação 4: "+(V3 + V2));
		System.out.println("Operação 5: "+(V3 - V2));
		System.out.println("Operação 6: "+(V1 + V2 + V3));
		
		sc.close();
	}
}
