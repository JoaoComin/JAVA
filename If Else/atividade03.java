import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dia;
		int mes;
		int ano;
		int dia2;
		int mes2;
		int ano2;
		
		
		System.out.printf("Digite um DIA: ");
		dia = sc.nextInt();
		System.out.printf("Digite um MES: ");
		mes = sc.nextInt();
		System.out.printf("Digite um ANO: ");
		ano = sc.nextInt();
		
		System.out.printf("Digite um segundo DIA: ");
		dia2 = sc.nextInt();
		System.out.printf("Digite um segundo MES: ");
		mes2 = sc.nextInt();
		System.out.printf("Digite um segundo ANO: ");
		ano2 = sc.nextInt();
	
		
		if(ano > ano2) {
			System.out.println("A maior ano �: "+dia+"/"+mes+"/"+ano);
			System.out.println("O menor ano �: "+dia2+"/"+mes2+"/"+ano2);
		} else if(ano2 > ano) {
			System.out.println("A maior data �: "+dia+"/"+mes+"/"+ano);
			System.out.println("E a menor �: "+dia2+"/"+mes2+"/"+ano2);
		} else if(mes > mes2){
			System.out.println("O maior mes �: "+dia+"/"+mes+"/"+ano);
			System.out.println("O menor mes �: "+dia2+"/"+mes2+"/"+ano2);
		} else if (mes2 > mes) {
			System.out.println("O maior mes �: "+mes2);
			System.out.println("O menor mes �: "+dia2+"/"+mes2+"/"+ano2);
		} else if(dia > dia2) {
			System.out.println("O maior dia �: "+dia);
			System.out.println("O menor dia �: "+dia2);
		} else if(dia2 > dia) {
			System.out.println("O maior dia �: "+dia2);
			System.out.println("O maior dia �: "+dia);
		} else {
			System.out.println("As datas s�o iguais!");
		}
		
		sc.close();
	}

}
