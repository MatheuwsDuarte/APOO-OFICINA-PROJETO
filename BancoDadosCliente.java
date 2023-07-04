package Classes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BancoDadosCliente{
    private Cliente c;
    private List<Cliente> listaCliente = new ArrayList<Cliente>();

    private static BancoDadosCliente clienteList;
        BancoDadosCliente(){
        
    }
    public static BancoDadosCliente getClienteList(){
        if(clienteList == null){
            clienteList = new BancoDadosCliente();
        }
        return clienteList;
    }
    public List<Cliente> getListaClientes(){
        return listaCliente;
    }

    public Cliente cadCliente(Cliente c){
        if(consCliente(c) == null){
            listaCliente.add(c);
            return c;
        }
        else{
            return null;
        }
    }
    public Cliente consCliente(Cliente c){
        for(int i = 0; i < listaCliente.size(); i++){
            if(c.getCPF()== null ? listaCliente.get(i).getCPF()== null : c.getCPF().equals(listaCliente.get(i).getCPF())){
                return listaCliente.get(i);
            }
        }
        return null;
    }
    public Cliente removeCliente(Cliente c){
        Cliente c1 = consCliente(c);
        if(c1 != null){
            listaCliente.remove(c1);
            return null;
        }
        else{
            return c;
        }
    } 
    public Cliente atualizaCliente(Cliente c){
        for(int i = 0; i< listaCliente.size(); i++){
            if(c.getCPF()== null ? listaCliente.get(i).getCPF()== null : c.getCPF().equals(listaCliente.get(i).getCPF())){
                c.setNome(JOptionPane.showInputDialog(null, "Informe o novo nome", "Atualizacao", JOptionPane.QUESTION_MESSAGE)); 
                c.setTelefone(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o novo telefone", "Atualizacao", JOptionPane.QUESTION_MESSAGE)));
                c.setEmail(JOptionPane.showInputDialog(null, "Informe o novo email", "Atualizacao", JOptionPane.QUESTION_MESSAGE));
                //Dados do endereco
                c.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o novo numero", "Atualizacao", JOptionPane.QUESTION_MESSAGE)));
                c.setLogradouro(JOptionPane.showInputDialog(null, "Informe o novo logradouro", "Atualizacao", JOptionPane.QUESTION_MESSAGE));
                c.setBairro(JOptionPane.showInputDialog(null, "Informe o novo bairro", "Atualizacao", JOptionPane.QUESTION_MESSAGE));
                c.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o novo CEP", "Atualizacao", JOptionPane.QUESTION_MESSAGE)));
                listaCliente.set(i, c);
                return listaCliente.get(i);
            }
        }
        return null;
    }
}

