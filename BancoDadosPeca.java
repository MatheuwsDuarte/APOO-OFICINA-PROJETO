package Classes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoDadosPeca {
    private Peca p;
    private List<Peca> listaPeca = new ArrayList<Peca>();

    private static BancoDadosPeca pecaList;
    BancoDadosPeca(){
    }
        
    public static BancoDadosPeca getPecaList(){
        if(pecaList == null){
            pecaList = new BancoDadosPeca();
        }
        return pecaList;
    }
    
    public List<Peca> getListaPeca(){
        return listaPeca;
    }
    
    public Peca cadPeca(Peca pec){
        if(consPeca(pec) == null){
            listaPeca.add(pec);
            return pec;
        }
        else{
            return null;
        }
    }
    
    public Peca consPeca(Peca p){
        for(int i = 0; i < listaPeca.size(); i++){
            if(p.getPeca() == null ? listaPeca.get(i).getPeca() == null : p.getPeca().equals(listaPeca.get(i).getPeca())){
                return listaPeca.get(i);
            }
        }
        return null;
    }
    
    public Peca removePeca(Peca p){
        Peca p1 = consPeca(p);
        if(p1 != null){
            listaPeca.remove(p1);
            return null;
        }
        else{
            return p;
        }
    }
    
    public Peca atualizaPeca(Peca p){
        for(int i = 0; i < listaPeca.size(); i++){
            if((p.getPeca() == null ? listaPeca.get(i).getPeca() == null : p.getPeca().equals(listaPeca.get(i).getPeca()))){
                p.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nova quantidade", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                p.setValorPeca(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o novo valor", "Atualização", JOptionPane.QUESTION_MESSAGE)));
                listaPeca.set(i, p);
                return listaPeca.get(i);
            }
        }
        return null;
    }
    
}