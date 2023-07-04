package Classes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoDadosCarro {
    private Carro c;
    private List<Carro> listaCarro = new ArrayList<Carro>();

private static BancoDadosCarro carroList;
    BancoDadosCarro(){
        
    }
public static BancoDadosCarro getCarroList(){
    if(carroList == null){
        carroList = new BancoDadosCarro();
    }
    return carroList;
}
public List<Carro> getListaCarro(){
    return listaCarro;
}
public Carro cadCarroPlaca(Carro car){
    if(consCarroPlaca(car) == null){
        listaCarro.add(car);
        return car;
    }
    else{
        return null;
    }
}
public Carro consCarroPlaca(Carro c){
    for(int i = 0; i < listaCarro.size(); i++){
        if((c.getCarroPlaca() == null ? listaCarro.get(i).getCarroPlaca() == null : c.getCarroPlaca().equals(listaCarro.get(i).getCarroPlaca()))){
            return listaCarro.get(i);
        }
    }
    return null;
}
public Carro removeCarroPlaca(Carro c){
    Carro c1 = consCarroPlaca(c);
    if(c1 != null){
        listaCarro.remove(c1);
        return null;
    }
    else{
        return c;
    }
}
public Carro atualizaCarroPlaca(Carro c){
    for(int i = 0; i < listaCarro.size(); i++){
        if((c.getCarroPlaca() == null ? listaCarro.get(i).getCarroPlaca() == null : c.getCarroPlaca().equals(listaCarro.get(i).getCarroPlaca()))){
                c.setCarroAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o novo ano", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                c.setCarroModelo( JOptionPane.showInputDialog(null, "Informe o novo modelo", "Atualização", JOptionPane.QUESTION_MESSAGE));
                c.setCarroCor(JOptionPane.showInputDialog(null, "Informe a nova cor", "Atualização", JOptionPane.QUESTION_MESSAGE));
                c.setCarroMarca(JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualização", JOptionPane.QUESTION_MESSAGE));
                listaCarro.set(i, c);
                return listaCarro.get(i);
        }
    }
    return null;
} 
}

