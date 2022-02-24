package javau;

import entities.Produto;
import java.util.Scanner;

public class AppPreco {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Produto N,C,M;
        N = new Produto();
        C = new Produto();
        M = new Produto();
        
        System.out.println("Qual o nome do produto?");
        N.descricao = sc.nextLine();
        System.out.println("Qual o custo do produto?");
        C.custo = sc.nextDouble();
        System.out.println("Qual a margem de lucro desejada (%)");
        M.lucro = sc.nextFloat();
        M.lucro = (float)(M.lucro/100); 
        double preco = C.custo + (C.custo * M.lucro);
        System.out.printf("A sugestão de preço do produto é:  %.2f", preco);
        
    }
    
}
