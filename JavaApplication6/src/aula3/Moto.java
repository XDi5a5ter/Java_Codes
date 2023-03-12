/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula3;

/**
 *
 * @author Meu Computador
 */
public class Moto extends veiculo{
    private String motor;
    private int ano;
    
    public Moto(){
        this.instanciarLocomacao();
    }

    @Override
    public void instanciarLocomacao() {
     locomacao = new motor();
    }

}
