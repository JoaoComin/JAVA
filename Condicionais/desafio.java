
import java.util.*;
 
public class desafio {
 
    Scanner sc = new Scanner(System.in);
 
    int a;
    int b;
    int c;
    double delta, x1, x2;
 
    public desafio() {
        deltaCalculo();
    }
 
    private void deltaCalculo() {
 
        System.out.println("Digite o valor de A: ");
        a = Integer.parseInt(sc.next());
        System.out.println("Digite o valor de B: ");
        b = Integer.parseInt(sc.next());
        System.out.println("Digite o valor de C: ");
        c = Integer.parseInt(sc.next());
 
        delta = (b * b) + (-4 * (a * c));
 
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
            calculaX();
        } else {
            System.out.println("Delta não possui raiz");
            System.exit(0);
        }
 
    }
 
    private void calculaX() {
 
        x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
        x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
 
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
 
    }
 
    public static void main(String[] args) {
        new desafio();
    }
 
}