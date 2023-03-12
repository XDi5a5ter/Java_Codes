package calculadoraMapa;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] agrs){
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao, quadrado;
        int op;
        op = 10;
        
        while(op !=0){
        System.out.println("******* Selecione uma operação *******");       
        System.out.println("[1] - SOMA" );
        System.out.println("[2] - SUBTRAÇÂO");
        System.out.println("[3] - MULTIPLICAÇÂO");
        System.out.println("[4] - DIVISÂO");  
        System.out.println("[5] - CALCULAR O QUADRADO DE UM NUMERO");
        System.out.println("[0] - SAIR");  
        System.out.println("******* Digite a sua Opção *******");
        
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
                System.out.println(" A soma é: "+soma);
                break;
            case 2:
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();       
                                      
                System.out.println(" Informe o segundo valor ");
                n2 = entrada.nextDouble();
                subtracao = n1-n2;
                System.out.println(" A subtração é: "+subtracao);
                break;
            case 3:
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();       
                                      
                System.out.println(" Informe o segundo valor ");
                n2 = entrada.nextDouble();
                multiplicacao = n1*n2;
                System.out.println(" A multiplicação é: "+multiplicacao);
                break;
            case 4 :
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();       
                                      
                System.out.println(" Informe o segundo valor ");
                n2 = entrada.nextDouble();
                if(n1<n2){
                    System.out.println(" Impossível Realizar Calculo ");
                }
                else{
                divisao = n1/n2;
                System.out.println(" A Divisão é: "+divisao);
                }
                break;
            case 5:
                System.out.println(" Informe o primeiro valor ");
                n1 = entrada.nextDouble();                                                 
                quadrado = n1*n1;
                System.out.println(" O quadrado é: "+quadrado);
                break;
        
            default:              
                System.out.println(" Operação inválida! ");
                
        }                                          
    }
}
}
