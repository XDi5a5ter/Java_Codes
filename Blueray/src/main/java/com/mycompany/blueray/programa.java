
package com.mycompany.blueray;

import java.util.Scanner;


public class programa {

    
    public static void main(String[] args) {
        Bluray objBluray = new Bluray();
        ItemBlueRay objItem;
        while(true){
            objItem = new ItemBlueRay();
            System.out.println("1- Cadastrar Blu-Ray");
            System.out.println("2- Imprimir lista de Blu-Ray");
            System.out.println("3- Cadastrar Blu-Ray com Desconto");
            System.out.println("4- Fim");
            System.out.println("Entre com a opcao desejada: ");
            Scanner scan = new Scanner(System.in);
            int opcao = scan.nextInt();
            if(opcao==4)
                break;
            switch(opcao){
                case 1:
                    objBluray.cadastrarBluRay(objItem);
                    objBluray.adicionarLista(objItem);
                    break;
                case 2:
                    objBluray.imprimirLista();
                    break;
                case 3:
                    objBluray.cadastrarBluRay(objItem);
                    System.out.println("Valor do blu-ray com promocao de: ");
                    System.out.println(interfaceBluRay.PROMOCAO);
                    double valorDesconto = 
                            objItem.getPreco()- (objItem.getPreco()*
                            interfaceBluRay.PROMOCAO)/100;
                    objItem.setPreco(valorDesconto);
                    objBluray.adicionarLista(objItem);
                    System.out.println(); System.out.println();
                    break;
                default:
                        System.out.println("Opção Invalida");
            }
        }
          
    }
    
}
