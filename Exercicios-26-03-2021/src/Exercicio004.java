import java.util.Scanner;

public class Exercicio004 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Valor:");
		float valor = sc.nextFloat();
		
		float acrescido = (float) (valor + (valor * (15.8/100)));
		System.out.println("Valor atualizado: "+(acrescido));
		sc.close();
	}
}
