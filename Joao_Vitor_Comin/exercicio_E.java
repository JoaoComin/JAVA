import java.util.Scanner;

public class exercicio_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		double salario;
		double comissao;
		double salariofinal;
		double valorvenda;
		
		System.out.println("Digite o salario do funcionario: ");
		salario = sc.nextDouble();
		System.out.println("Digite o valor de suas vendas: ");
		valorvenda = sc.nextDouble();
		
		comissao = valorvenda * 0.04;
		salariofinal = valorvenda * 0.04 + salario;
		
		System.out.println("Salario receido: "+ salario);
		System.out.println("Valor de comissao recebido: "+ comissao);
		System.out.println("Salario final recebido: "+ salariofinal);
		
		sc.close();

	}

}
