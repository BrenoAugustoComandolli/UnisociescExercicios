import java.util.Scanner;

public class ExercicioTreino001 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe primeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Informe segundo número: ");
		double n2 = sc.nextDouble();
		
		double resultado = n1 * n2;
		System.out.println("Resultado: "+resultado);
		
		sc.close();
	}
}
