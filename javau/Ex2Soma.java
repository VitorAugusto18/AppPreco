package javau;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2Soma {
    public static void main(String[]args){
        
        
        int b;
        int soma;
        boolean teste = true;
        Scanner leia = new Scanner(System.in);
        do{
        try{ 
        System.out.println("Digite o valor de a:");
        int a =leia.nextInt();
        System.out.println("Digite o valor de b:");
        b =leia.nextInt();
        soma = a + b;
        System.out.println("A soma dos valores é ="+ soma);   
        teste = false;
            System.out.println("Passei por aqui e acabou");
       // leia.close();
        } catch (InputMismatchException erro1) {
        System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
        leia.nextLine(); //descarta a entrada errada do usuário
        }
        } while(teste);
    }
}
