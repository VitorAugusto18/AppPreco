package javau;
import java.util.Scanner;
public class Ex4DifProd {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int difProd;
        int a,b,c,d;
        System.out.println("Entre com 4 valores inteiros abaixo sendo para a,b,c ed respectivamente:");
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        d = leia.nextInt();
        difProd = (a*b - c*d);
        System.out.println("A diferença do produto dos valores indicados é ->"+difProd);
    }
    
}
