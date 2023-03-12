

package aula3;


public class Carro extends veiculo {
    private String motor;
    
    public Carro(){
        this.instanciarLocomacao();
    }
    
    @Override
    public void acelerar(){
        locomacao.acelerar();
    }

    public String getMotor() {
        return this.motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void instanciarLocomacao() {
        locomacao = new motor();
    }
  
        
    }
           


