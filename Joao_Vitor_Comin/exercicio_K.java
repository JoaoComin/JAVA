import java.util.Scanner;

public class exercicio_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int hora;
		int min;
		int seg;
		int Total1, Total2, Total3;
		
		System.out.println("Digite o valor de hora: ");
		hora = sc.nextInt();
		
		System.out.println("Digite o valor de min");
		min = sc.nextInt();
		
		Total1 = hora * 60;
		Total2 = min + Total1;
		Total3 = Total2 * 60;
		
		System.out.println("Hora em minuto: "+Total1);
		System.out.println("Total em minutos: "+Total2);
		System.out.println("Total em segundos: "+Total3);
		
	}

}
