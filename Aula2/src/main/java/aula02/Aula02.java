

package aula02;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Aula02 {
    
    public static void main(String[] args){
        
        Produto p = new Produto();
        p.nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
        p.valorCusto = Double.
                parseDouble(JOptionPane.showInputDialog("Digite o Valor de custo do produto: "));
        p.valorVenda= 40.0;
        p.codigo= 5;
        p.quantidadeEstoque= 50;
        
        JOptionPane.showMessageDialog(null, "O lucro do meu produto é: " + p.calcularLucro());
        
        p.mostrarDadosDosProdutos();
        
        cliente c= new cliente();
        c.nome = " Ramon ";
        
        venda venda = new venda();
        venda.cliente = c;
        
        List<Produto> produtos = new ArrayList<>();
        
    }
}
