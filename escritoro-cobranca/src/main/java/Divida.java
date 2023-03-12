
public class Divida {
    private final Pessoa devedora;
    private final Pessoa cobradora;
    private final Double valorDivida;
    
    public Divida(Pessoa devedora, Pessoa cobradora, double valorDivida){
        this.devedora=devedora;
        this.cobradora =cobradora;
        this.valorDivida = valorDivida;
        
    }

    public Pessoa getDevedora() {
        return devedora;
    }

    public Pessoa getCobradora() {
        return cobradora;
    }

    public Double getValorDivida() {
        return valorDivida;
    }
    
}
