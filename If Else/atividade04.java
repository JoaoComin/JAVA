import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora;
		int minuto;
		int hora2;
		int minuto2;
		int horatotal;
		int minutototal;
		
		System.out.printf("Digite a HORA de inicio do jogo: ");
		hora = sc.nextInt();
		System.out.printf("Digite o MINUTO de inicio do jogo: ");
		minuto = sc.nextInt();
		
		System.out.println("Digite a HORA de termino do jogo: ");
		hora2 = sc.nextInt();
		System.out.println("Digite o MINUTO de termino do jogo: ");
		minuto2 = sc.nextInt();
		
		
		if(hora > 23) {
			System.out.println("Hora invalida!");
		}
		 
		sc.close();
	}

}
