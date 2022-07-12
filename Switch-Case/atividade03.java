import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int crit;
		int quanLivro;
		
		System.out.println("Selecione o criterio que você deseja: ");
		System.out.println("(1)	Critério A: R$0,25 por livro + R$7,50 fixo");
		System.out.println("(2)	Critério B: R$0,50 por livro + R$2,50 fixo");
		crit = sc.nextInt();
		
		System.out.println("digite a quantidade de livro que você deseja comprar: ");
		quanLivro = sc.nextInt();
		
		if (quanLivro <= 10) {
			crit = 1;
		} if (quanLivro >= 11)
			crit = 2;
			
		switch(crit) {
		case 1:
			System.out.println("A melhor opção para você é o Critério A");
			break;
		
			case 2:
			System.out.println("A melhor opção para você é o Critério B");
			break;
		
			default:
			System.out.println("Nenhuma das opções!");
		}
		
		
		
		
		sc.close();

	}

}
