package programa;

import java.util.Locale;
import java.util.Scanner;

public class financiamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		double salario;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO");
		System.out.print("Nome do Cliente: ");
		nome = sc.nextLine();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		
		while ( salario < 0) {
			System.out.print("O salario nao pode ser negativo. Tente Novamente: ");
			salario = sc.nextDouble();
		}
		
		sc.close();
	}

}
