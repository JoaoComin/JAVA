import java.util.Scanner;

public class exercicio_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int x;
		int y;
		
		System.out.println("Digite o primeiro numero: ");
		x = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		y = sc.nextInt();
		
		
		System.out.println(x * y);
		
		sc.close();
		

	}

}
