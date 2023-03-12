

package aula3;


public class Bike extends veiculo {
    
    public Bike(){
        this.instanciarLocomacao();
    }

    @Override
    public void instanciarLocomacao() {
        locomacao = new pedal();
    }
    
    

}
