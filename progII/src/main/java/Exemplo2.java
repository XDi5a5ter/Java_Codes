
import javax.swing.JOptionPane;
import javax.swing.JTextArea;




public class Exemplo2 {

    
    public static void main(String[] args) {
        int[]array = {10, 15, 25, 3, 8, 7};
        int total = 0;
        String saida = "Indice\tValor\n";
        
        for (int i = 0; i < array.length; i++){
            total += array[i];
            saida += i+ "\t"+ array[i] + "\n";
            
        }
        
        saida += "\n\nA soma dos lementos do Array é: "+
               "total";
        
        JTextArea saidaArea = new JTextArea();
        saidaArea.setText(saida);
        
        JOptionPane.showMessageDialog(null, saidaArea,
                "Criando um array de Inteiros",
                JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
       
    }
    
}
