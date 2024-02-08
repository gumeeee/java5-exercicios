package lista02;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {
		String nomeColaborador, cargo = "";
		int codigoCargo;
		float salario, novoSalario = 0;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Nome do colaborador: ");
		nomeColaborador = leitura.nextLine();

		System.out.println("###### MENU #####");
		System.out.println("Digite o numero do cargo");
		System.out.println("1 - Gerente, Reajuste: (10%)");
		System.out.println("2 - Vendedor, Reajuste: (7%)");
		System.out.println("3 - Supervisor, Reajuste: (9%)");
		System.out.println("4 - Motorista, ajuste: (6%)");
		System.out.println("5 - Estoquista, ajuste: (5%)");
		System.out.println("6 - Técnico de TI, ajuste: (8%)");
		codigoCargo = leitura.nextInt();

		System.out.println("Digite seu salário: ");
		salario = leitura.nextFloat();

		switch (codigoCargo) {
		case 1:
			novoSalario = salario + (0.1f * salario);
			cargo = "Gerente";
			break;
		case 2:

			novoSalario = salario + (0.07f * salario);
			cargo = "Vendedor";
			break;
		case 3:

			novoSalario = salario + (0.09f * salario);
			cargo = "Supervisor";
			break;
		case 4:

			novoSalario = salario + (0.06f * salario);
			cargo = "Motorista";
			break;
		case 5:

			novoSalario = salario + (0.05f * salario);
			cargo = "Estoquista";
			break;
		case 6:

			novoSalario = salario + (0.08f * salario);
			cargo = "Técnico de TI";
			break;
		}

		System.out.println("Nome do colaborador: " + nomeColaborador);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + novoSalario);

	}

}
