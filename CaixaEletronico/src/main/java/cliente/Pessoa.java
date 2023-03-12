/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cliente;
import java.util.Scanner;
/**
 *
 * @author Meu Computador
 */
public abstract class Pessoa {
    protected String telefone;
    protected String nomePessoa;
    protected Endereco e = new Endereco();   
    public void cadastra(){
        Scanner tec = new Scanner (System.in);
        System.out.println("Digite o Nome");
        nomePessoa = tec.nextLine();
        System.out.println("digite o telefone");
        telefone = tec.nextLine();
        e.cadastra();
    }
    public void imprime(){
        System.out.println("Nome:"+getNomePessoa());
    }
    public Endereco getE()
    
    public void setE(Endereco e){...}
    public String getNomePessoa(){...}
}

