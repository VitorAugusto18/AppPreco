package javau;

public class CastingEx {

    public static void main(String[] args) {
        int a,b;
        double resultadoCasting, resultado;
        
        a= 10;
        b= 3;
        resultado = a/b;
        resultadoCasting = (double)a/b;
        
        System.out.println("resultado da divisão é = " + resultado);
        /*No caso acima não foi usado o casting de dados ou seja como
        o resultado é do tipo double e as variavies são do tipo int o
        sistema vai haver perda de dados mas como não foi tratado ele
        desconsidera as casas decimais*/
        System.out.println("resultado da divisão é = " + resultadoCasting);
        /*Acima já mostrará o resultado usando o casting onde eu não quero perder dados e assim ele 
        irá mostrar o resultado de fato em double porque ele converte ao colocar double entre parentese
        na atribuição*/
    }
    
}
