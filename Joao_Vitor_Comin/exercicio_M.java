import java.util.Scanner;

public class exercicio_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double vlrSalMin;
		double kW;
		double vlrKW = 1;
		double vlrTotal;
		double vlrDesconto;
		double vlrSalMin1;
		
		System.out.println("Digite o valor do salario minimo: ");
		vlrSalMin = sc.nextDouble();
		
		System.out.println("Digite a quantidade de kW consumido em sua residencia: ");
		kW = sc.nextDouble();
		
		vlrSalMin1 = vlrSalMin/6;
		vlrTotal = vlrSalMin1 * kW;
		vlrDesconto = vlrTotal * 0.18;
		
		System.out.println("Valor total pago pela residencia: "+vlrTotal);
		System.out.println("Valor total com desconto pago pela residencia: "+vlrDesconto);

	}

}
