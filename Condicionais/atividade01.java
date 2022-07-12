import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double notaLab;
		double notaAva;
		double notaExa;
		double media;
		
		System.out.println("Digite a nota do laboratorio: ");
		notaLab = sc.nextInt();
		System.out.println("Digite a nota da avaliação: ");
		notaAva = sc.nextInt();
		System.out.println("Digite a nota do exame: ");
		notaExa = sc.nextInt();
		
		notaLab = notaLab*2;
		notaAva = notaAva*3;
		notaExa = notaExa*5;
		
		media = (notaLab + notaAva + notaExa) /10;
		
		System.out.println("Sua media é: "+media);
		
		if (media >= 0 && media <= 5) {
			System.out.println("Parabéns seu conceito é: E");
		} 
		if (media >= 5 && media <= 6) {
			System.out.println("Parabéns seu conceito é: D");
		} 
		if (media >6 && media <= 7) {
			System.out.println("Parabéns seu conceito é: C");
		} 
		if (media >=7 && media <= 8) {
			System.out.println("Parabéns seu conceito é: B");
		} 
		if (media >=8 && media <= 10) {
			System.out.println("Parabéns seu conceito é: A");
		}
		sc.close();
	}

}
