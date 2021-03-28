import java.util.Scanner;

public class ExercicioTreino003 {
	
	public static void main(String[] args) {
		
		double nota1, nota2, nota3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1:");
		nota1 = sc.nextDouble();
		
		System.out.println("Nota 2:");
		nota2 = sc.nextDouble();

		System.out.println("Nota 3:");
		nota3 = sc.nextDouble();

		if((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
			System.out.println("Alguma nota digitada está inválida!");
		}else {
			double media = (nota1+nota2+nota3)/3;
			System.out.println("Média: "+media);
		}
		
		sc.close();
	}
}
