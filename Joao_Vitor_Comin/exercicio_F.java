import java.util.Scanner;

public class exercicio_F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);  
	    double salarioMinimo;
	    double salarioFuncionario;
	    double salariosMinimos;
	    
	    System.out.print("Digite o valor do salario minimo: ");
	    salarioMinimo = Double.parseDouble(sc.nextLine());
	    System.out.print("Digite o salario que o funcionario recebe: ");
	    salarioFuncionario = Double.parseDouble(sc.nextLine());
	     
	    salariosMinimos = salarioFuncionario / salarioMinimo;
	    System.out.println("O funcionário recebe " + salariosMinimos + " salários mínimos");
	    
	    sc.close();
	     
	  }
	}