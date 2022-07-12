import java.util.Scanner;

public class exercicio_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		double dolarAustraliano;
		double bitcoin;
		double libraEsterlina;
		double quantDinheiro;
		double valrTotal1,valrTotal2,valrTotal3;
		
		System.out.println("Digite o valor em REAIS que você está levando: ");
		quantDinheiro = sc.nextDouble();
		
		System.out.println("Digite o valor do BITCOIN atual: ");
		bitcoin = sc.nextDouble();
		
		System.out.println("Digite o valor da LIBRA ESTERLINA atual; ");
		libraEsterlina = sc.nextDouble();
		
		System.out.println("Digite o valor do DOLAR AUSTRALIANO: ");
		dolarAustraliano = sc.nextDouble();
		
		valrTotal1 = quantDinheiro * bitcoin;
		valrTotal2 = quantDinheiro * libraEsterlina;
		valrTotal3 = quantDinheiro * dolarAustraliano;
		
		System.out.println("O valor depois de converter para BITCOIN ficara: "+ valrTotal1);
		System.out.println("O valor depois de converter para LIBRA ESTERLINA ficara: "+ valrTotal2);
		System.out.println("O valor depois de converter para DOLAR AUSTRALIANO ficara: "+ valrTotal3);

	}

}
