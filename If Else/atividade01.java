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
		
		System.out.println("Escolha um opção abaixo");
		
		System.out.println("Opção 1 - Somar dois números");
		
		System.out.println("Opção 2 - Raiz quadrada de um numero");
		
		System.out.println("Digite a opção desejada: ");
		opcao = sc.nextInt();
		
		if(opcao == 1) {
			System.out.println("Você escolheu a opção de soma!");
			System.out.println("Digite um numero: ");
			num1 = sc.nextInt();
			System.out.println("Digite outro numero: ");
			num2 = sc.nextInt();
			
			soma = (num1 + num2);
			
			System.out.println("Resultado: "+soma);
				
			}else if(opcao == 2){
				System.out.println("Você escolheu a opção de raiz");
				System.out.println("Digite um numero: ");
				num = sc.nextInt();
				
				raiz = (int) Math.sqrt(num);
				
				System.out.println("Resultado: "+raiz);
				
			}else{
				System.out.println("Opção invalida!");
					
				
			}
		
		sc.close();
	}

}
