package exemplos;

import java.util.Scanner;

public class swith_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String dia;
		
		switch (n){
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			default:
				dia = "valor invalido";
				break;
		}
		
		System.out.println("Hoje é "+dia);
		
		sc.close();
		

	}

}
