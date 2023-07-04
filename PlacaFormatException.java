package Classes;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class PlacaFormatException extends Exception{
	
	public void impPlacaE(){
		JOptionPane.showMessageDialog(
                    null,
                    "Insira a placa corretamente (8 caracteres)",
                    "Placa incorreta",
                    JOptionPane.ERROR_MESSAGE
                );
	}


}