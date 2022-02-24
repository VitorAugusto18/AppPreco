package javau;
import java.util.Scanner;
import java.util.Locale;
public class JavaU {


    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String product1 = "";
        String product2 = "";
        /*Requisição de entrada de informação do tipo String*/
        System.out.println("Entre com o primeiro produto:");
        /*Comando abaixo é usado para receber uma entrada String(texto)*/
        product1= leia.nextLine();
        System.out.println("Entre com o segundo produto:");
        product2= leia.nextLine();
        
        byte age = 30;/*nesse caso foi usado byte no lugar de int porque dificilmente terá valor acima de 100*/
        int code = 5290;
        char gender = 'F';
        
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;
    
        System.out.println("products:");
        System.out.printf("%s, com preço de R$ %.2f%n", product1, price1);
        System.out.printf("%s, com preço de R$ %.2f%n", product2, price2);
        System.out.println("");
        System.out.printf("Record:%d anos de idade, codigo %d e genero %c%n", age,code, gender);
        System.out.println("");
        System.out.printf("Medir com 8 casas decimais: %.8f%n", measure);
        System.out.printf("arredondar(três casas decimais):%.3f%n", measure);
        Locale.setDefault(Locale.US);
        /*O comando locale acima faz com que a partir dessa linha eu considere o ponto decimal como . e não ,*/
        System.out.printf("US potno decimal: %.3f%n", measure);
    }
    
}
