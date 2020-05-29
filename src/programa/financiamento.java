package programa;

import java.util.Locale;
import java.util.Scanner;

public class financiamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double salario, porcentagemEntrada, totalFinanciado;
		int prestacoes, opcao;

		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do Cliente: ");
		nome = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();

		while (salario < 0) {
			System.out.print("O salario nao pode ser negativo. Tente Novamente: ");
			salario = sc.nextDouble();
		}

		System.out.print("Numero de prestacoes: ");
		prestacoes = sc.nextInt();
		System.out.print("Porcentagem de entrada: ");
		porcentagemEntrada = sc.nextDouble();
		System.out.print("Valor Total Financiado: ");
		totalFinanciado = sc.nextDouble();

		double prestacao = totalFinanciado * (100.0 - porcentagemEntrada) / 100.00 / prestacoes;

		while (prestacao > 0.3 * salario) {
			System.out.print("Capacidade de pagamento excedida! Tente Novamente: ");
			totalFinanciado = sc.nextDouble();
			prestacao = totalFinanciado * (100.0 - porcentagemEntrada) / 100.00 / prestacoes;
		}

		double entrada = totalFinanciado * porcentagemEntrada / 100.00;
		double valorFinanciadoPrazo = totalFinanciado - entrada;
		do {

			System.out.print("");
			System.out.println("MENU: ");
			System.out.println("1 - Mostrar valor da entrada\r\n" + "2 - Mostrar o valor financiado\r\n"
					+ "3 - Mostrar valor de cada prestação\r\n" + "4 - Sair\r\n" + "Digite uma opcao: ");
			opcao = sc.nextInt();

			if (opcao == 1) {

				System.out.printf("ENTRADA = R$ %.2f%n", entrada);

			} else if (opcao == 2) {
				System.out.printf("VALOR FINANCIADO : R$ %.2f%n", valorFinanciadoPrazo);
			}

			else if (opcao == 3) {
				System.out.printf("VALOR DE CADA PRESTACAO = R$ %.2f%n", prestacao);
			}
			
			else if (opcao != 4) {
				System.out.println("OPCAO INVALIDA");	
			}
			
			
		} while (opcao != 4);

		System.out.println("FIM DO PROGRAMA!");
		
		sc.close();
	}

}
