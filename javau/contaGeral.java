package javau;

import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

public class contaGeral {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        int numConta;
        String usuarioConta;
        double depositoConta;
        String opcao;

        System.out.println("Entre com o número da conta:");
        numConta = leia.nextInt();
        System.out.println("Entre com usuário:");
        usuarioConta = leia.next();
        System.out.println("Deseja realizar deposito incial?(S/N) ");
        opcao = leia.next();
        if (opcao.equalsIgnoreCase("S")) {
            System.out.println("Entre com o valor de deposito incial");
            depositoConta = leia.nextDouble();
            Conta conta2 = new Conta(usuarioConta, numConta, depositoConta);
            System.out.println(conta2);
            System.out.println("adcicione um deposito:");
            depositoConta = leia.nextDouble();
            conta2.deposita(depositoConta);
            System.out.println(conta2);
            System.out.println("Digite valor de saque:");
            depositoConta = leia.nextDouble();
            conta2.saque(depositoConta);
            System.out.println(conta2);
        }else{
            Conta conta = new Conta(usuarioConta, numConta);
            System.out.print(conta);
        }
        

    }
}
