package entities;

public class Funcionario {
    
    public String nome;
    public double salarioB;
    public double taxa;
    
    public double salarioFinal(){
        double result = salarioB - taxa;
        return result;
    }
    public void aumentoSalario(float aumento) {
        this.salarioB += (this.salarioB * (aumento/100));
        
    }
    public String toString(){
        return nome
                + ", salário Bruto: R$"
                + String.format("%.2f", salarioB)
                + ", Taxa: R$"
                + taxa
                + ", Salário Liquido: R$"
                + String.format("%.2f", salarioFinal());
    }
}
