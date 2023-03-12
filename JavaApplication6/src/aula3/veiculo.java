

package aula3;


public abstract class veiculo {
    
    private String modelo;
    
    private String marca;
    
    protected Locomacao locomacao;
    
    public abstract void instanciarLocomacao();
    
    public void acelerar(){
        locomacao.acelerar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void parar(){
        System.out.println("Parar");
    }



}
