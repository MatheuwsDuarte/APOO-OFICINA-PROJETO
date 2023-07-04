package Classes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoDadosServico {
    private Servico s;
    private List<Servico> listaServico = new ArrayList<Servico>();

private static BancoDadosServico servicoList;
    BancoDadosServico(){
    
}
public static BancoDadosServico getServicoList(){
    if(servicoList == null){
        servicoList = new BancoDadosServico();
    }
    return servicoList;
}
public List<Servico> getListaServico(){
    return listaServico;
}

public Servico cadServico(Servico s){
    if(consServico(s) == null){
        listaServico.add(s);
        return s;
    }
    else{
        return null;
    }
}
public Servico consServico(Servico s){
    for(int i = 0; i < listaServico.size(); i++){
        if(s.getDescricao() == null ? listaServico.get(i).getDescricao() == null : s.getDescricao().equals(listaServico.get(i).getDescricao())){
            return listaServico.get(i);
        }
    }
    return null;
}
public Servico removeServico(Servico s){
    Servico s1 = consServico(s);
    if(s1 != null){
        listaServico.remove(s1);
        return null;
    }
    else{
        return s;
    }
}
public Servico atualizaServico(Servico s){
    for(int i = 0; i< listaServico.size(); i++){
        if(s.getDescricao() == null ? listaServico.get(i).getDescricao() == null : s.getDescricao().equals(listaServico.get(i).getDescricao())){
             s.setHorasTrabalhadas(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a nova hora trabalhada", "Atualização", JOptionPane.QUESTION_MESSAGE)));
             s.setValorHora(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o novo valor", "Atualização", JOptionPane.QUESTION_MESSAGE)));
            listaServico.set(i, s);
            return listaServico.get(i);
        }
    }
    return null;
}
}

