
import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um numero: ");
		double num = sc.nextDouble();
		
		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		double r2 = Math.sqrt(num);
		double r3 = Math.cbrt(num);
		
		System.out.println("N�mero ao quadrado: "+quad);
		System.out.println("N�mero ao cubo: "+cubo);
		System.out.println("Ra�z quadrada: "+r2);
		System.out.println("Ra�z cubica: "+r3);
		
		sc.close();
	}

}
