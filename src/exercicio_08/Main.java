package exercicio_08;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double imposto;
		
		
		System.out.print("Digite o seu sálario: ");
		salario = sc.nextDouble();
		
		if (salario >= 4500.00) {
			imposto = 0.28 * salario;
			System.out.println(imposto);
			System.out.println(salario);
		}
		
		sc.close();

	}

}
