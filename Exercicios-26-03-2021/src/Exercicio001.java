import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		n1 = sc.nextDouble();
		
		System.out.println("Digite o segundo número:");
		n2 = sc.nextDouble();
		
		if(n2 != 0) {
			System.out.println("Adição: "+(n1+n2));
			System.out.println("Subtração: "+(n1-n2));
			System.out.println("Mutiplicação: "+(n1*n2));
			System.out.println("Divisão: "+(n1/n2));
		}else {
			System.out.println("Divisão por zero inválida!");
		}
		sc.close();
	}

}
