
package Dados;


public class Pessoa {
    String nome;
    String telefone;
    int idade;
    
    public Pessoa(){
        idade = 0;
        nome = "";
        telefone = "";       
                   
    }
    public Pessoa(String nom, String tel, int id){
        nome = nom;
        telefone = tel;
        idade = id;
    }
}


