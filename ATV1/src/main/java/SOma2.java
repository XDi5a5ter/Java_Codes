
import java.util.*;
import javax.swing.JOptionPane;
 
public class SOma2 {
    public static void main(String args[]) {
        int N, i,J = 0, soma = 0;
 
        Scanner in = new Scanner(System.in);
        
        N = 1000;
 
        for(i = 0; i <= N; i++){
            boolean name = J == 0;
            if((i%2) == 1){
                soma += i;
            }
        }
     while(J == 0){
        JOptionPane.showMessageDialog(null,"Soma dos numeros impares entre 0 a 1000: "
            + soma);
        J=1;
        }
    }
}
