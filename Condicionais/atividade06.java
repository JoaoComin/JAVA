import java.util.Scanner;

public class atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("Seu numero é par!");
		} if(numero %2 == 1) { 
			System.out.println("Seu numero é impar!");
		}
		sc.close();
	}

}
