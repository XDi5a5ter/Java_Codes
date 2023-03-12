
public class Principal {
    
    public static void main(String[]args){
        
        PessoaJuridica lojaDoBairro= new PessoaJuridica();
        lojaDoBairro.setNome("Loja do Bairro");
        lojaDoBairro.setCnpj("2346457878799");
        PessoaFisica joao = new PessoaFisica();
        joao.setNome("Joao");
        joao.setCpf("453647875");
        joao.setDataNascimento("15/11/1999");
        
        
        Divida divida = new Divida(joao, lojaDoBairro, 1000.00);
        AcordoDivida acordoDivida = new AcordoDivida(divida,FormaDePagamento.BOLETO );
        System.out.println("#######Dados do Devedor:");
        System.out.println("Nome:"+acordoDivida.getDivida().getDevedora().getNome());
        System.out.println("Data Nascimento:"+acordoDivida.getDivida().getDevedora().getDataFormatado());
        System.out.println("Documento:"+acordoDivida.getDivida().getDevedora().getDocumento());
        System.out.println("#######Dados do Cobrador:");
        System.out.println("Nome:"+acordoDivida.getDivida().getCobradora().getNome());
        System.out.println("Documento:"+acordoDivida.getDivida().getCobradora().getDocumento());
        System.out.println("Valor da Divida: "+acordoDivida.getDivida().getValorDivida());
        System.out.println("Forma de pagamento: "+acordoDivida.getFormaDePagamento().name());
        System.out.println("Valor total: "+acordoDivida.getValorTotal());
        
    }
    

}
