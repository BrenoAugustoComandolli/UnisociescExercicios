import java.util.Scanner;

public class Exercicio005 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base:");
		double base = sc.nextDouble();
		
		System.out.println("Altura:");
		double altura = sc.nextDouble();
		
		double area = (base * altura)/2;
		System.out.println("Área: "+area);
		
		sc.close();
	}
}
