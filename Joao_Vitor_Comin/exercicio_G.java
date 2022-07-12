import java.util.Scanner;

public class exercicio_G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in); 
		  int x;
		  int tabuada;
		  
		  System.out.println("Informar um número: ");
	        x = sc.nextInt();

	        int multiplicador = 0;
	        while(multiplicador <= 10)
	        {
	            int resultado = x * multiplicador;
	            System.out.println(resultado);   
	            multiplicador++;
	            
	            sc.close();
	        }
		}
	}


