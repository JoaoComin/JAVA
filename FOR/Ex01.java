import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
	    int multiplicador = 0;
	    int total = 0;

	    System.out.println("Digite um numero inteiro para ver a tabuada: ");
	    num = sc.nextInt();

	    for (int x = 0; x < 10; x++) {
	            total = num * ++multiplicador;
	            System.out.println(num + " * " + multiplicador + " = " + total);
	        }

	}
}