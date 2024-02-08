package lista02;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		int codigoProduto, quantidade;
		float precoProduto, valorTotal;

		Scanner leitura = new Scanner(System.in);

		System.out.println("##### MENU #####");
		System.out.println("1 - Cachorro Quente (R$ 10,00)");
		System.out.println("2 - X-Salada (R$ 15,00)");
		System.out.println("3 - X-Bacon (R$ 18,00)");
		System.out.println("4 - Bauru (R$ 12,00)");
		System.out.println("5 - Refrigerante (R$ 8,00)");
		System.out.println("6 - Suco de laranja (R$ 13,00)");
		codigoProduto = leitura.nextInt();

		System.out.println("Quantidade do produto: ");
		quantidade = leitura.nextInt();

		switch (codigoProduto) {
		case 1:
			valorTotal = quantidade * 10.00f;

			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
		case 2:
			valorTotal = quantidade * 15.00f;

			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
		case 3:
			valorTotal = quantidade * 18.00f;

			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
		case 4:
			valorTotal = quantidade * 12.00f;

			System.out.println("Produto: Bauru");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
		case 5:
			valorTotal = quantidade * 8.00f;

			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
		case 6:
			valorTotal = quantidade * 13.00f;

			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: R$ " + valorTotal);
			break;
		}
	}

}
