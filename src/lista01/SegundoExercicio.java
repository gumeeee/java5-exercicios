package lista01;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraDoacao;
		int opcao;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		nome = leitura.nextLine();

		System.out.println("Digite a sua idade: ");
		idade = leitura.nextInt();

		System.out.println("Sua primeira doação? (true/false)");
		primeiraDoacao = leitura.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if (idade >= 60 && idade <= 69) {
				if (primeiraDoacao) {
					System.out.println(nome + " não está apto para doar sangue.");
				} else {
					System.out.println(nome + " está apto para doar sangue.");
				}
			} else {
				System.out.println(nome + " está apto para doar sangue.");
			}
		} else {
			System.out.println(nome + " não está apto para doar sangue.");
		}

	}
}
