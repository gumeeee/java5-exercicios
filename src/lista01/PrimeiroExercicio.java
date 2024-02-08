package lista01;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leitura.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leitura.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leitura.nextInt();
		
		leitura.close();
		
		if (a + b > c) {
			System.out.println("A soma de A + B é maior do que C");
		} else if (a + b < c) {
			System.out.println("A soma de A + B é menor do que C");
		} else {
			System.out.println("A soma de A + B é igual a C");
		}
		
		

	}

}
