import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int crit;
		int quanLivro;
		
		System.out.println("Selecione o criterio que voc� deseja: ");
		System.out.println("(1)	Crit�rio A: R$0,25 por livro + R$7,50 fixo");
		System.out.println("(2)	Crit�rio B: R$0,50 por livro + R$2,50 fixo");
		crit = sc.nextInt();
		
		System.out.println("digite a quantidade de livro que voc� deseja comprar: ");
		quanLivro = sc.nextInt();
		
		if (quanLivro <= 10) {
			crit = 1;
		} if (quanLivro >= 11)
			crit = 2;
			
		switch(crit) {
		case 1:
			System.out.println("A melhor op��o para voc� � o Crit�rio A");
			break;
		
			case 2:
			System.out.println("A melhor op��o para voc� � o Crit�rio B");
			break;
		
			default:
			System.out.println("Nenhuma das op��es!");
		}
		
		
		
		
		sc.close();

	}

}
