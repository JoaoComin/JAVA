import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		double exame;;
		
		System.out.println("Digite a sua primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a sua segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a sua terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3) /3;
		
		System.out.println("Sua média é: "+media);
		
		if (media >= 6 && media <= 10) {
			System.out.println("Você foi aprovado!");
		} 
		if (media >= 3 && media <= 5.9) {
			System.out.println("Você está de exame!");
			exame = 6 - media;
			System.out.println("Voce precisa de: "+exame);
		} 
		if (media >= 0 && media <= 2.9) {
			System.out.println("Você foi reprovado!");
		}
		
	}

}
