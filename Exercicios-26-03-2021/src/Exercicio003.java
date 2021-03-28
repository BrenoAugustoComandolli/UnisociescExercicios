import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio003 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LocalDateTime data = LocalDateTime.now();
		
		System.out.println("Ano de Nascimento:");
		int dataNasc = sc.nextInt();
		
		int idade = (data.getYear() - dataNasc);
		
		System.out.println("Idade: "+idade);
		
		sc.close();
	}
}
