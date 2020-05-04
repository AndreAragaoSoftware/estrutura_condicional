package exercicios;

import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, resul;
		
		System.out.println("Digite um número inteiro");
		x = sc.nextInt();
		
		resul = x % 2;
		
		if (resul == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		
		
		sc.close();

	}

}
