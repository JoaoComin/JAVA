import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int x = 0;
		 int y = 0;
		 int i;
		 int j=0;
		 int idade;
		 int qtdeidade = 0;
		 int qtde = 0;
		 double peso;
		 double altura;
		 double media = 0;
		 
		 System.out.println("Digite o valor de x ");
		 x = sc.nextInt();
		 
		 for(i=1;i<=x;i++){ 
		 System.out.println("Digite o valor de y");
		 y = sc.nextInt();
		 
		  for(j=1;j<=y;j++){
			  System.out.println("Digite a idade do jogador "+j);
			  idade = sc.nextInt();
			  
			  System.out.println("Digite o peso do jogador ");
			  peso = sc.nextDouble();
			  
			  System.out.println("Digite a altura do jogador ");
			  altura = sc.nextDouble();
			  
			  qtdeidade += idade;
			  media = qtdeidade/y;
			  
			  if(idade < 18){
				  qtde = qtde +1;
			  	}
		  	}
		 }
	}
}