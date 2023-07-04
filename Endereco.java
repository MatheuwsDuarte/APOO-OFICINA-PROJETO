
package Classes;

public abstract class Endereco{

	private int numero = 0;
	private String logradouro = "";
	private String bairro = "";
        private int cep = 0;

//Numero ==============================================

	public int getNumero(){
		return numero;		
	}


	public void setNumero(int numero){

            this.numero = numero;
		
	}

//Logradouro ==================================

	public String getLogradouro(){
		return logradouro;
		
	}


	public void setLogradouro(String logradouro){
		this.logradouro = logradouro;

	}
//Bairro ==================================

	public String getBairro(){
		return bairro;
		
	}


	public void setBairro(String bairro){
		this.bairro = bairro;

	}
        
//Cep ==================================

	public int getCep(){
		return cep;
		
	}


	public void setCep(int cep){

            this.cep = cep;
		
	}
}









