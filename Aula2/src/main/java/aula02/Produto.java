

package aula02;

import javax.swing.JOptionPane;


public class Produto {
    int codigo;
    
    String nome;
    
    double valorCusto;
    
    double valorVenda;
    
    int quantidadeEstoque;
    
    public double calcularLucro(){
        double lucro = valorVenda - valorCusto;
        return lucro;
    }
    
    public void mostrarDadosDosProdutos(){
        String msg = "Código" +codigo +"\n";
        msg = msg + "Nome" + nome + "\n";
        msg = msg + "Valor Custo" +valorCusto+"\n";
        msg = msg + "Valor de Venda" +valorVenda+"\n";
        JOptionPane.showMessageDialog(null, msg);
 
}
}
