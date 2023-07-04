
package Classes;
public class Servico extends Carro implements CalcularHora{
    private String descricao;
    private int horasTrabalhadas;
    private float valorHora;
    private float valorFinal = 0;
    
   public float calcular(int horasTrabalhadas, float valorHora){
        valorFinal = horasTrabalhadas * valorHora;
        return valorFinal;	
    }
    
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public float getValorHora(){
        return valorHora;
    }
    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    
}
