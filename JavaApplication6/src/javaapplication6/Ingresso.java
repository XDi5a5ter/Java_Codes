

package javaapplication6;


public class Ingresso {
    private String nome;
    private String cpf;
    private String eventoRelacionado;

    public Ingresso(String nome, String cpf, String eventoRelacionado){
        this.nome = nome;
        this.cpf = cpf;
        this.eventoRelacionado = eventoRelacionado;
        
    }

    public Ingresso() {
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(String eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }
    
    
    
}
