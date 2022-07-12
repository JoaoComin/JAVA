import java.util.Scanner;

public class exercicio_L {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int vlrMusc;
		int vlrIngr;
		int quantConvite;
		
		System.out.println("Digite o valor do show musical: ");
		vlrMusc = sc.nextInt();
		
		System.out.println("Digite o valor do ingresso: ");
		vlrIngr = sc.nextInt();
		
		quantConvite = vlrMusc / vlrIngr;
		
		System.out.println("O total de convites deve ser: "+quantConvite);
		

	}

}
