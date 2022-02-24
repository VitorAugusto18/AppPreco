package javau;

import java.util.Scanner;

public class negativoOuPositivo {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int x;
        System.out.println("Entre com o valor:");
        x = leia.nextInt();
        
        if(x<0){
            System.out.println("valor é negativo");
        }else{
            System.out.println("Valor não negativo");
        }
    }
    
}
