
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TelaVerImagens extends JFrame {
    
    private static final long serialVersionUID = 1L;
    
    private JLabel figura;
    private ImageIcon imagem;
    
    public TelaVerImagens(){
        super("Tela para visualização de imagens");
        
        this.configuraTela();
        
        this.preparandoMenu();
    }
    
    private void configuraTela(){
        this.setLayout(new FlowLayout());
        this.setSize(800,600);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.carregaImagem(null);
        this.add(figura);
    }
    
    private void preparandoMenu(){
        JMenuBar barraMenu = new JMenuBar();
        this.setJMenuBar(barraMenu);
        
        JMenu menuArquivo = new JMenu("Arquivo");
        barraMenu.add(menuArquivo);
        
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        itemAbrir.addActionListener(new ListenerTela());
        menuArquivo.add(itemAbrir);
        
        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(new ListenerTela());
        menuArquivo.add(itemSair);
    }
    
   
    private void carregaImagem(String caminho){
        if(caminho == null || caminho.isEmpty()){
            caminho = "conteudo/figura1.jpg";
            imagem = new ImageIcon(caminho);
            figura = new JLabel(imagem);
            this.add(figura);
        }
        File arquivo = new File(caminho);
        
        if(arquivo.exists()){
            imagem = new ImageIcon(caminho);
            figura.setIcon(imagem);
            figura.repaint();
        }else{
            JOptionPane.showInputDialog(this, "O caminho é invalido");
        }
        
    }
     private class ListenerTela implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evento) {
            String acao = evento.getActionCommand();
            
            if("Abrir".equals(acao)){
                String caminho = JOptionPane.showInputDialog("Digite o "
                        + "caminho da imagem");
                carregaImagem(caminho);
            }else if("Sair".equals(acao)){
                fecharTela();
            }
        }
        
    }
    
    private void fecharTela(){
        this.setVisible(false);
        System.exit(0);
    }

    public static void main(String args[]) {
        TelaVerImagens tela = new TelaVerImagens();
        tela.setVisible(true);
       
    }
}
        
