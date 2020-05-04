package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double sal, imp, inc;

		sal = sc.nextDouble();
		
				
		if (sal > 2000.00 && sal <= 3000.00) {
			imp = sal - 2000;
			imp = imp * 0.08;
			System.out.printf("R$ %.2f%n", imp);

		} 
		else if (sal > 3000.00 && sal <= 4500.00) {
			imp = sal%3000;
			imp = imp * 0.18;
			sal = 1000 * 0.08;
			inc = sal + imp;
			System.out.printf("R$ %.2f%n", inc);

		}
		else if ( sal > 4500.00) {
			inc = (sal - 4500)*0.28;
			sal = 1000 * 0.08;
			imp = 1500 * 0.18;
			inc = inc + sal + imp;
			System.out.printf("R$ %.2f%n", inc);
		}
		else {
			System.out.println("Isento");
		}

		sc.close();
	}
}
