
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class TelaInicial1 extends JFrame {
    
    private static final long serialVersionUID = 1L;
    
    private JLabel label1;
    
    public TelaInicial1(){
        super("Tela Inicial");
        
        this.configuraTela();
    }
    
    private void configuraTela(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 100);
        
        label1 = new JLabel("Sejam bem vindos!!!");
        label1.setToolTipText("Este é o rotulo 1");
        add(label1);
    }
    public static void main(String[] args) {
        TelaInicial1 tela = new TelaInicial1();
        tela.setVisible(true);
        
    }   
}
