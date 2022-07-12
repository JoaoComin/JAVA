import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double numero1;
		double numero2;
		double numero3;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		numero2 = sc.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		numero3 = sc.nextDouble();
		
		if (numero1 > numero2) {
				if(numero1 > numero3) {
					if(numero3 < numero2) {
						System.out.println("Numero 1"+numero1);
						System.out.println("Numero 2"+numero2);
						System.out.println("Numero 3"+numero3);
					}
				}
			}
		if (numero2 > numero1) {
			if (numero2 > numero3) {
				if (numero3 < numero1) {
				System.out.println("Numero 1"+numero1);
				System.out.println("Numero 2"+numero2);
				System.out.println("Numero 3"+numero3);
			}
		}
	}

		if (numero3 > numero1) {
			if(numero3 > numero2) {
				if(numero1 > numero2) {
					if(numero1 < numero2) {
					System.out.println("Numero 1"+numero1);
					System.out.println("Numero 2"+numero2);
					System.out.println("Numero 3"+numero3);
				}
			}
		}
	}
}
	sc.close();
}
