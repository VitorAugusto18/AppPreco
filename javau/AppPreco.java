package javau;

import entities.Produto;
import java.util.Scanner;

public class AppPreco {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Produto P;
        P = new Produto();
        
        
        System.out.println("Qual o nome do produto?");
        P.descricao = sc.nextLine();
        System.out.println("Qual o custo do produto?");
        P.custo = sc.nextDouble();
        System.out.println("Qual a margem de lucro desejada (%)");
        P.lucro = sc.nextFloat();
        P.lucro = (float)(P.lucro/100); 
        double precoP = P.preco();
        System.out.printf("A sugestão de preço do produto é:  %.2f", precoP);
        
    }
    
}
