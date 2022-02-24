package javau;
import java.util.Scanner;
public class Ex3area {
    
    public static void main (String[]args){
        Scanner leia = new Scanner (System.in);
        double PI = 3.14159, area;
        int R;
        
        System.out.println("Digite o raio da area a ser calculada:");
        R = leia.nextInt();
        area = PI * (Math.pow(R, 2));
        System.out.printf("A area calculada é de %.2f ",area);
    }
}
