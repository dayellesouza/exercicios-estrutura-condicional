package exercicio_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada;
		
		System.out.println("Esse programa diz se um n�mero � negativo ou n�o.");
		System.out.print("Digite um n�mero: ");
		entrada = sc.nextInt();
		
		if (entrada >= 0) {
			System.out.println("N�O NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
