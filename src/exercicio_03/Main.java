package exercicio_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, equi;
		
		System.out.print("Digite o primeiro valor: ");
		A = sc.nextInt();
		System.out.print("\nDigite o segundo valor: ");
		B = sc.nextInt();
		
		if (A > B) {
			equi = A / B;
			equi = equi * B;
			
			if (equi == A) {
				System.out.println("S�o multiplos");
			} else {
				System.out.println("N�o s�o multiplos");
			}
			
		} else {
			equi = B / A;
			equi = equi * A;
			
			if (equi == B) {
				System.out.println("S�o multiplos");
			} else {
				System.out.println("N�o s�o multiplos");
			}
		}
		
		
		sc.close();
	}

}
