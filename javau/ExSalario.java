package javau;

import entities.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class ExSalario {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario();
        
        System.out.println("Entre com os dados do funcionário");
        System.out.print("Nome:");
        funcionario.nome = sc.nextLine();
        System.out.print("Digite o salário Bruto:");
        funcionario.salarioB = sc.nextDouble();
        System.out.print("Digite o valor da Taxa aplicada:");
        funcionario.taxa = sc.nextDouble();
        
        System.out.println("");
        System.out.print("Dados do funcionário:" + funcionario);
        
        System.out.println("");
        System.out.print("Qual valor de aumento do salário do funcionário:");
        float aumento = sc.nextFloat();
        funcionario.aumentoSalario(aumento);
        
        System.out.println("");
        System.out.print("Dados do funcionário atualizado:" + funcionario);
        
        sc.close();
    }
    
}
