package exercicios;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o s�o Multiplos");
		}
		
		sc.close();

	}

}
