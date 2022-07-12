package dwhile;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num=0;
		
		do {
			System.out.println("Digite um numero maior que 1 (um): ");
			num = sc.nextInt();
			
		} while (num < 1);
		
		if (num == 3 || num == 5 || num == 7) {
		System.out.println("Seu número é primo!");
	} 
	else {
		if (num % 2 ==0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
			System.out.println("Seu número não é primo");
		} else {
			System.out.println("Seu número é primo");
		}
}
	}
}
