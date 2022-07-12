import java.util.Scanner;

public class exercicio_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		double x;
		double y;
		double divisao;
		
		System.out.println("Digite o primeiro numero (nao pode ser 0): ");
		x = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		y = sc.nextDouble();
		divisao = x/y;
		
		System.out.println("Resultado: " + divisao);
		
		sc.close();
	}

}
