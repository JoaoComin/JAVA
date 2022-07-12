import java.util.Scanner;

public class atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int salario;
		String cargo;
		double porcentagem = 0;
		int x;
		double salAtualizado;
		
		System.out.println("Digite um codigo de 1 a 5: ");
		x = sc.nextInt();
		
		System.out.println("Digite o seu salario: ");
		salario = sc.nextInt();
		
		switch(x) {
		case 1:
			cargo = "Escrituario";
			porcentagem = salario * 0.50;
			break;
		case 2:
			cargo = "Secretário";
			porcentagem = salario * 0.35;
			break;
		case 3:
			cargo = "Caixa";
			porcentagem = salario * 0.20;
			break;
		case 4:
			cargo = "Gerente";
			porcentagem = salario * 0.10;
			break;
		case 5:
			cargo = "Diretor";
			porcentagem = salario * 0;
			break;
		default:
			cargo = "Nenhum";
			break;
		}
		
		salAtualizado = porcentagem + salario;
		
		System.out.println("Cargo: "+cargo);
		System.out.println("Salario atualizado: "+salAtualizado);
			sc.close();	
	}

}
