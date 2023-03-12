


import java.util.Scanner;


public class Java{
     private static double calcularDelta() throws IllegalArgumentException{
         
        int a, b, c;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        a = entrada.nextInt();
        
        System.out.println("Informe o valor de B: ");
        b = entrada.nextInt();
        
        System.out.println("Informe o valor de C");
        c = entrada.nextInt();
        double delta = Math.pow(b,2) - 4*a*c;
        
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta<0) {
            throw new IllegalArgumentException("Delta : "+delta+"\nSem Raízes Reais.");
            
        }
        System.out.println("Valor de Delta : "+ delta);
        
        System.out.println("Valor de x1 : "+x1);
        
        System.out.println("Valor de x2 : "+x2);
        return delta;
    }


    public static void main(String[] args) {
        calcularDelta();
  
    }
}

    

