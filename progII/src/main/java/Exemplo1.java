
import javax.swing.*;

public class Exemplo1 {

    
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        String saida = "indice\tValor\n";
        
        for (int i = 0; i<array.length; i++){
            saida += i + "\t" + array[i] + "\n";
        }
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea, "Criando um array de "
                + "inteiros", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
    }
    
}
