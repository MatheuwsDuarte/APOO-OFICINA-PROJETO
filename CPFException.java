
package Classes;

import javax.swing.JOptionPane;

public class CPFException extends Exception{
	
	public void impCPFE(){
		JOptionPane.showMessageDialog(
                    null,
                    "O CPF possui 11 números",
                    "CPF incorreto",
                    JOptionPane.ERROR_MESSAGE
                );
	}
}