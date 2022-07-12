import java.util.Scanner;

public class exercicio_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		double x; 
		double gasolina;
		
		System.out.println("Digite o preço da gasolina: ");
		x = sc.nextDouble();
		
		gasolina = x * 0.10;
		
		System.out.println("Novo preço: " + (gasolina + x));
		
		sc.close();
	}

}

