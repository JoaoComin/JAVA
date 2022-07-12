import java.util.Scanner;

public class exercicio_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double x;
		double conta1;
		double conta2;
		double valorDesconto1, valorDesconto2;
		double desconto1, desconto2;
		double totalSal, totalDesc;
		
		System.out.println("Digite o salario de João: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor da primeiro conta: ");
		conta1 = sc.nextDouble();
		System.out.println("Digite o valor da segunda conta: ");
		conta2 = sc.nextDouble();
		
		
		valorDesconto1 = conta1 * 0.05;
		desconto1 = conta1 - valorDesconto1;
		
		valorDesconto2 = conta2 * 0.05;
		desconto2 = conta2 - valorDesconto2;
		
		totalDesc=desconto1+desconto2;
		
		totalSal = x-totalDesc;
		
		System.out.println(totalSal);	
		
		sc.close();
	}

}
