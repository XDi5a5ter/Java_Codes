

package javaapplication6;

import java.util.ArrayList;
import java.util.List;



public class Evento extends Mapa{
    private String nome;
    private String data;
    private int CapacidadeMaxima = 100;
    private Double valorUnico = 100.00;

    public Double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(Double valorUnico) {
        this.valorUnico = valorUnico;
    }
    private List<Ingresso>ingressos;
    
    public Evento(){
        
    }
    
    public Evento(String nome, String data){
        this.nome = nome;
        this.data = data;
        this.ingressos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCapacidadeMaxima() {
        return CapacidadeMaxima;
    }

    public void setCapacidadeMaxima(int CapacidadeMaxima) {
        this.CapacidadeMaxima = CapacidadeMaxima;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
    
    public void venderIngresso(Ingresso ingresso){
        ingressos.add(ingresso);
    }
 
    public void MostrarResumo(){
        System.out.println("Ingressos Vendidos: "+ ingressos.size());
        String msg = "Nome Evento" + this.nome+ "\n";
        msg += "Data" + this.data + "\n\n";
        
        
        for(int i = 0; i < ingressos.size(); i++){
           String nomeIngresso = ingressos.get(i).getNome();
           String cpfIngresso = ingressos.get(i).getCpf();
           msg += "Ingresso Nome: " +  nomeIngresso + "\n";
           msg += "Ingresso Cpf: " +  cpfIngresso + "\n";
           msg+= "Valor do Ingresso: "+ valorUnico+ "\n\n";
           
    }
        System.out.println(msg);
    }
}
