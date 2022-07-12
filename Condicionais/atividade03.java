import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double x;
		double y;
		double numeros;
		
		System.out.println("Digite o primerio numero: ");
		x = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		y = sc.nextDouble();
			
		if (x > y) {
			System.out.println("O maior numero é: "+x);
		}
		if (x < y) {
			System.out.println("O maior numero é: "+y);
		}
		if (x == y) {
			System.out.println("Os numeros são iguais!");
		}
		sc.close();
	}
}
