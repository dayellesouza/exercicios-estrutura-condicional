package exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Voc� deve fazer um programa que leia um valor qualquer e 
		apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
		este valor se encontra. Obviamente se o valor n�o estiver em
		nenhum destes intervalos, dever� ser impressa a mensagem 
		�Fora de intervalo�.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double val;
		
		System.out.print("Digite um valor: ");
		val = sc.nextDouble();
		
		if (val >= 0 && val <= 25.00) {
			System.out.println("valor: " + val);
			System.out.println("Intervalo [0,25]");
			
		} else if (val > 25.00 && val <= 50.00) {
			System.out.println("valor: " + val);
			System.out.println("Intervalo [25, 50]");
		
		} else if (val > 50.00 && val <= 75.00) {
			System.out.println("valor: " + val);
			System.out.println("Intervalo [50, 75]");
			
		} else if (val > 75.00 && val <= 100.00) {
			System.out.println("valor: " + val);
			System.out.println("Intervalo [75, 100]");
			
		} else {
			System.out.println("valor: " + val);
			System.out.println("Fora de intervalo");
		}
		
		sc.close();

	}

}
