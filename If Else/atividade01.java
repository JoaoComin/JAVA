import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma;
		int opcao;
		int num1;
		int num2;
		int num;
		int raiz;
		
		System.out.println("Escolha um op��o abaixo");
		
		System.out.println("Op��o 1 - Somar dois n�meros");
		
		System.out.println("Op��o 2 - Raiz quadrada de um numero");
		
		System.out.println("Digite a op��o desejada: ");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Voc� escolheu a op��o de soma!");
			System.out.println("Digite um numero: ");
			num1 = sc.nextInt();
			System.out.println("Digite outro numero: ");
			num2 = sc.nextInt();
			
			soma = (num1 + num2);
			
			System.out.println("Resultado: "+soma);
				
			}else if(opcao == 2){
				System.out.println("Voc� escolheu a op��o de raiz");
				System.out.println("Digite um numero: ");
				num = sc.nextInt();
				
				raiz = (int) Math.sqrt(num);
				
				System.out.println("Resultado: "+raiz);
				
			}else{
				System.out.println("Op��o invalida!");
					
				
			}
		
		sc.close();
	}

}
