import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double vlrParcela;
		double pagAvista;
		double pagCheque;
		double pagParcelado12;
		double pagParcelado6;
		int vlrTotal;
		int opc;
		double vlrTotal2;
		
		System.out.println("Digite o valor total de sua compra: ");
		vlrTotal = sc.nextInt();
		System.out.println("Escolha um método de pagamento ");
		System.out.println("(1)	Pagamento à vista - 15% de desconto sobre o valor total da compra");
		System.out.println("(2)	Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra");
		System.out.println("(3)	Pagamento parcelado em 6 vezes - não tem desconto");
		System.out.println("(4)	Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra");
		opc = sc.nextInt();
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		switch(opc) {
		
		case 1:
			System.out.println("Seu pagamento vai ser avista com 15% de desconto!");
			pagAvista = vlrTotal * 0.15;
			vlrTotal2 = vlrTotal - pagAvista;
			System.out.println("Valor total: R$"+vlrTotal);
			System.out.println("Valor que você ira pagar com desconto: R$"+vlrTotal2);
			System.out.println("Com uma diferença de: R$"+pagAvista);
			break;
			
		case 2:
			System.out.println("Seu pagamento vai ser com cheque com 10% de desconto!");
			pagCheque = vlrTotal * 0.10;
			vlrTotal2 = vlrTotal - pagCheque;
			System.out.println("Valor total: R$"+vlrTotal);
			System.out.println("Valor que você ira pagar com desconto: R$"+vlrTotal2);
			System.out.println("Com uma diferença de: R$"+pagCheque);
			break;
			
		case 3:
			System.out.println("Seu pagamento será parcelado em 6 vezes portanto não havera desconto!");
			pagParcelado6 = vlrTotal * 0;
			vlrTotal2 = vlrTotal / 6;
			System.out.println("Valor total: R$"+vlrTotal);
			System.out.println("O valor de sua parcela será de: R$"+vlrTotal2);
			break;
		
		case 4:
			System.out.println("Seu pagamento será parcelado em 12 vezes com um juros de 8%!");
			pagParcelado12 = vlrTotal * 0.08;
			vlrTotal2 = vlrTotal + pagParcelado12;
			vlrParcela = vlrTotal2 / 12;
			System.out.println("Valor total: R$"+vlrTotal);
			System.out.println("Valor que você ira pagar com desconto: R$"+vlrTotal2);
			System.out.println("Você ira pagar a mais: R$"+pagParcelado12);
			System.out.println("O valor de sua parcela será de: R$"+vlrParcela);
			break;
		
		default:
			System.out.println("Erro tente novamente!");
		}
		
	}

}
