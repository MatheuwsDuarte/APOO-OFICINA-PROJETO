
package Classes;


public class Peca extends Carro implements CalcularPeca{
    private String pecaNome;
    private int quantidade;
    private float valorPeca;
    private float valorFinal = 0;
    
    public float calcular(float valorPeca){
        valorFinal = valorFinal + valorPeca;
        return valorFinal;	
    }
    
    public String getPeca(){
        return pecaNome;
    }
    public void setPeca(String pecaNome){
        this.pecaNome = pecaNome;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public float getValorPeca(){
        return valorPeca;
    }
    public void setValorPeca(float valorPeca){
        this.valorPeca = valorPeca;
    }
    
}
