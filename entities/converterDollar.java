
package entities;

public class converterDollar {
    public static double percentual=0.06;
    double price, dollar, valor, resultado;

    public static double valor(double price,double dollar){
        double resultado = price*dollar;
        return resultado += resultado*percentual;
    }
    //public String toString(){
      //  return String.format("%.2f",resultado);
    //}
    
}
