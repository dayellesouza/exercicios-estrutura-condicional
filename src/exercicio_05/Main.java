package exercicio_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		double total;
		
		System.out.print("Digite o código: ");
		cod = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		quant = sc.nextInt();
		
		if (cod == 1) {
			total = (double) 4.0 * quant;
			System.out.println("\nCachorro Quente");
			System.out.printf("Total: R$%.2f" , total);
			
		} else if (cod == 2) {
			total = (double) 4.50 * quant;
			System.out.println("\nX-Salada");
			System.out.printf("Total: R$%.2f" , total);
			
		} else if (cod == 3) {
			total = (double) 5.0 * quant;
			System.out.println("\nX-Bacon");
			System.out.printf("Total: R$%.2f" , total);
			
		} else if (cod == 4) {
			total = (double) 2.0 * quant;
			System.out.println("\nTorrada simples");
			System.out.printf("Total: R$%.2f" , total);
			
		} else if (cod == 5) {
			total = (double) 1.5 * quant;
			System.out.println("\nRefrigerante");
			System.out.printf("Total: R$%.2f" , total);
			
		} else {
			System.out.println("\nEsse produto não existe");
		}
		
		
		sc.close();

	}

}
