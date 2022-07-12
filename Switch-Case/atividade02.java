import java.util.Scanner;

public class atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		double y;
		double z;
		double vlr;
		double vlrTotal;
		double vlrTotal2;
		double vlrZ = 0;
		
		System.out.println("Digite o código de 1 a 10 do produto comprado: ");
		x = sc.nextInt();
		
		System.out.println("Digite o peso do produto em QUILO: ");
		y = sc.nextDouble();
		
		System.out.println("Digite o código de origem do país de 1 a 3: ");
		z = sc.nextDouble();
		 if(z == 1) {
			 vlrZ = 0.0;
		 } else if(z == 2) {
			 vlrZ = 0.15;
		 } else if(z == 3) {
			 vlrZ = 0.25;
		 }
		
		System.out.println("-------------------------------------------------------------");
		switch(x) {
		case 1:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 1000;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 2:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 1000;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 3:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 1000;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 4:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 1000;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 5:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 2500;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 6:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 2500;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 7:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 2500;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 8:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 3500;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;

		case 9:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 3500;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		case 10:
			System.out.println("O peso do produto comprado é: "+y);
			System.out.println("O código do país de origem é: "+z);
			System.out.println("O valor do imposte é: "+vlrZ);
			vlr = y * 3500;
			vlrTotal = vlr * vlrZ;
			vlrTotal2 = vlrTotal + vlr;
			System.out.println("O preço total do produto é: R$"+vlrTotal2);
			break;
		default:
			System.out.println("Erro Tente novamente!");
		}
		
		sc.close();

	}

}
