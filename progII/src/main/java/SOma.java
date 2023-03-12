
import java.util.*;
import javax.swing.JOptionPane;
 
public class SOma {
    public static void main(String args[]) {
        int N, i, soma = 0;
 
        Scanner in = new Scanner(System.in);
        
        N = 1000;
 
        for(i = 0; i <= N; i++){
            if((i%2) == 1){
                soma += i;
            }
        }
     
        JOptionPane.showMessageDialog(null,"Soma dos numeros impares de 0 até 1000: "
            + soma);
    }
}


