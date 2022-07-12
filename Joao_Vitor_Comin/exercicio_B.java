import java.util.Scanner;

public class exercicio_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		double a;
		double b;
		double c;
		double d;
		double e;
		double soma;
		
		System.out.println("Digite o primeiro numero: ");
		a = sc.nextInt();		
		System.out.println("Digite o segundo numero: ");
		b = sc.nextInt();		
		System.out.println("Digite o terceiro numero: ");
		c = sc.nextInt();		
		System.out.println("Digite o quarto numero: ");
		d = sc.nextInt();		
		System.out.println("Digite o quinto numero: ");
		e = sc.nextInt();		
		soma = (a + b + c + d + e);
				
		System.out.println("Resultado1: " + soma/8);
		
		sc.close();
	}

}
