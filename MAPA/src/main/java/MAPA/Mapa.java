
package MAPA;

import java.util.Scanner;

public class Mapa {

    public static void main(String[] args) {
                
        double a, b, c;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("**************************");   
        
        System.out.println("Informe o valor de A: ");
        a = entrada.nextInt();
        
        System.out.println("Informe o valor de B: ");
        b = entrada.nextInt();
        
        System.out.println("Informe o valor de C");
        c = entrada.nextInt();
        
        System.out.println("**************************");                
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }
        System.out.println("**************************");     
        System.out.println("O valor de Delta é: "+ delta);
         
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println("O valor de x1 é: "+x1);
        
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("O valor de x2 é: "+x2);
        System.out.println("**************************"); 
    }

    }
        
    
    
    
        
    
    
    
    

