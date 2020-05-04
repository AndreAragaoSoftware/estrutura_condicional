package exercicios;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, resul;
		
		System.out.println("Digite o horario");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y ) {
			y = y + 24;
			resul = y - x;
			System.out.println("O jogo durou " + resul + " hora(s)");
		}
		else if (x == y) {
			System.out.println("O jogo durou 24 hora(s)");
		}
		else {
			resul = y - x;
			System.out.println("O jogo durou " + resul + " hora(s)");
		}
		
		
		sc.close();

	}

}
