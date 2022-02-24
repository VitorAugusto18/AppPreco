
package entities;

public class Produto {
    
    public String descricao;
    public Double custo;
    public Float lucro;
    
    public double preco(){
        double result = custo + (custo*lucro);
        return result;
    }
}
