package calculadoraMapa;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] agrs){
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao, quadrado;
        int op;
        op = 10;
        
        while(op !=0){
        System.out.println("******* Selecione uma opera��o *******");       
        System.out.println("[1] - SOMA" );
        System.out.println("[2] - SUBTRA��O");
        System.out.println("[3] - MULTIPLICA��O");
        System.out.println("[4] - DIVIS�O");  
        System.out.println("[5] - CALCULAR O QUADRADO DE UM NUMERO");
        System.out.println("[0] - SAIR");  
        System.out.println("******* Digite a sua Op��o *******");
        
        Scanner entrada = new Scanner (System.in); 
        op = entrada.nextInt();
        
        if(op ==0){
            return;
        }
        
        switch(op){
            case 1:
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();       
                                      
                System.out.println(" Informe o segundo valor ");
                n2 = entrada.nextDouble();
                soma = n1+n2;
                System.out.println(" A soma �: "+soma);
                break;
            case 2:
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();       
                                      
                System.out.println(" Informe o segundo valor ");
                n2 = entrada.nextDouble();
                subtracao = n1-n2;
                System.out.println(" A subtra��o �: "+subtracao);
                break;
            case 3:
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();       
                                      
                System.out.println(" Informe o segundo valor ");
                n2 = entrada.nextDouble();
                multiplicacao = n1*n2;
                System.out.println(" A multiplica��o �: "+multiplicacao);
                break;
            case 4 :
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();       
                                      
                System.out.println(" Informe o segundo valor ");
                n2 = entrada.nextDouble();
                if(n1<n2){
                    System.out.println(" Imposs�vel Realizar Calculo ");
                }
                else{
                divisao = n1/n2;
                System.out.println(" A Divis�o �: "+divisao);
                }
                break;
            case 5:
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();                                                 
                quadrado = n1*n1;
                System.out.println(" O quadrado �: "+quadrado);
                break;
        
            default:              
                System.out.println(" Opera��o inv�lida! ");
                
        }                                          
    }
}
}
