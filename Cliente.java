 
package Classes;


public class Cliente extends Endereco{

	private String cpf = "";
	private String nome = "";
	private int telefone  = 0;
        private String email  = "";

        
        
//CPF ==============================================

	public String getCPF(){
            return cpf;	
	}

	public void setCPF(String cpf) throws CPFException{
		if(cpf.trim().length() == 11){
                    this.cpf = cpf;
		}
		else{
                    throw new CPFException();
		}
	}

//Nome =====================================
   
	public String getNome(){
		return nome;
		
	}
        
        public void setNome(String nome){
		
            this.nome = nome;

	}
//Telefone ============================================

	public int getTelefone(){
            return telefone;
		
	}

	public void setTelefone(int telefone){
         
            this.telefone = telefone;
		
	}
	
// Email ===================================
	public String getEmail(){
		return email;	

	}	

	public void setEmail(String email){
            this.email = email;		
	}

  // Endereço ===================================      
  /* Pode utilziar esse construtor para gerar o endereço, ou simplesmente 
  chamar os metodos sets do endereço pois eles também fazem parte do cliente agora */

	
}









