package exercicio_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada, rest;
		
		System.out.println("Esse programa diz se um número é par ou impar.");
		System.out.print("Digite um número: ");
		entrada = sc.nextInt();
		
		rest = entrada % 2;
		
		if (rest == 0) {
			System.out.print("\n" + entrada);
			System.out.println(" = PAR");
		} else {
			System.out.print("\n" + entrada);
			System.out.println(" = IMPAR");
		}
		
		sc.close();
		
	}

}
