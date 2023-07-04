package Classes;
public class Carro{
        protected String placa;
        protected String marca;
        protected int ano;
        protected String cor;
        protected String modelo;
        
        public String getCarroPlaca(){
            return placa;
        }
        public void setCarroPlaca(String placa)throws PlacaFormatException{
            if(placa.length() <= 8 && placa.length() > 7 ){
              this.placa = placa;  
            }
            else{
                throw new PlacaFormatException();
            }
            
        }
        public String getCarroMarca(){
            return marca;
        }
        public void setCarroMarca(String marca){
            this.marca = marca;
        }
        public int getCarroAno(){
            return ano;
        }
        public void setCarroAno(int ano){
            this.ano = ano;
        }
        public String getCarroCor(){
            return cor;
        }
        public void setCarroCor(String cor){
            this.cor = cor;
        }
        public String getCarroModelo(){
            return modelo;
        }
        public void setCarroModelo(String modelo){
            this.modelo = modelo;
        }
        
}
