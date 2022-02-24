package javau;
import java.util.Scanner;
public class Ex5Salario {
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int registroF;
        //String resp1 = "sim";
        //String resp2 = "nao";
        //String resposta = "";
        double ht,valHora;
        double salarioS, salarioM;
        System.out.println("Digite o registro de funcionário:");
        registroF = leia.nextInt();
        System.out.println("Informe quantidade de hora trabalhada:");
        ht = leia.nextDouble();
        System.out.println("Informe o valor da hora trabalhada:");
        valHora = leia.nextDouble();
        salarioS = ht * valHora;
        System.out.printf("O salário do funcionário com registro %d é de %.2f", registroF, salarioS);
        System.out.println("Deseja saber salario do mês?");
        String resposta = leia.next();
        if("S".equals(resposta)){
            salarioM = salarioS * 4;
            System.out.printf("valor mensal a receber é de %.2f",salarioM);
        }else{
            System.out.println("Calculo finalizado");
        }
    }
    
}
