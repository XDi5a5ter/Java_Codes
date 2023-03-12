

package evento;

import java.util.ArrayList;
import java.util.List;


public class Ingresso {
    private String nome;
    private String cpf;
    private String eventoRelacionado;
    private Double valorUnico;
    private List<Ingresso> ingressos; 

    public Ingresso(String nome, String cpf, String eventoRelacionado) {
        this.nome = nome;
        this.cpf = cpf;
        this.eventoRelacionado = eventoRelacionado;
        this.ingressos = new ArrayList<Ingresso>();
    }
    public Double getValorUnico() {
        return valorUnico;
    }
    public void setValorUnico(Double valorUnico) {
        this.valorUnico = 100.00;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome=nome.toUpperCase();
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
    public void venderIngresso(Ingresso ingresso){
        ingressos.add(ingresso);
          
    }
    public void mostrarResumo(){
        String msg = "Nome "+ this.nome+"\n";
        msg += msg + "CPF "+ this.cpf+"\n";
        msg += msg + "Evento Relacionado "+ this.eventoRelacionado+"\n";
        
        for(int i = 0; 1 < ingressos.size(); i++){
            String nomeIngresso = ingressos.get(i).getNome();
            msg += "Ingresso "+ (i+1)+ nomeIngresso;
        }
        System.out.println(msg);
    }
}
