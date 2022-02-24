package javau;

import entities.converterDollar;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class exDollar {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner (System.in);
        
        double price, dollar;
        
        System.out.println("Digite o valor do Dollar:");
        price = leia.nextDouble();
        System.out.println("Qual a quantidade de Dollar você vai comprar:");
        dollar = leia.nextDouble();
        double teste = converterDollar.valor(price, dollar);
        System.out.printf("Valor a ser usado será = %.2f%n",teste);
    }
}
