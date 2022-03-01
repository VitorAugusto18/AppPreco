package javau;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class ProgramInvent {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("Entre with the product data");
        System.out.print("Name:");
        product.name = sc.nextLine();
        System.out.print("price:");
        product.price = sc.nextDouble();
        System.out.print("Stock:");
        product.quantity = sc.nextInt();
        //System.out.println(product.name + ", " +"R$" + product.price + "," + "QT " + product.quantity);
        System.out.println("Dados do produto:" + product);
        
        System.out.println("");
        System.out.print("Informe a quantidade que deseja adicionar do produto:");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        
        System.out.println("");
        System.out.print("Dados atualizados do produto:" + product);
        
        System.out.println("");
        System.out.print("Informe a quantidade que deseja remover do produto:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        
        System.out.println("");
        System.out.print("Dados atualizados do produto:" + product);
        
        sc.close();
    }
    
}
