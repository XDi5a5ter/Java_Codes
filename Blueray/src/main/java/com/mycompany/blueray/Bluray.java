

package com.mycompany.blueray;

import java.util.Scanner;
import java.util.Vector;


public class Bluray implements interfaceBluRay {
    private Vector<ItemBlueRay>listaBluray= new Vector<ItemBlueRay>();
    
    @Override
    public void adicionarLista(ItemBlueRay obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirLista() {
        System.out.println("Lista de Blu- Rays");
        for(int i = 0; i< this.listaBluray.size(); i++){
            System.out.println();
            System.out.println("Nome do Cliente:");
            System.out.println(this.listaBluray.get(i).getNomeCliente());
            System.out.println("Preco do Blu-Ray:");
            System.out.println(this.listaBluray.get(i).getPreco());
    }
        System.out.println("...............");
        System.out.println();
    }
    public void cadastrarBluRay(ItemBlueRay obj){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome do Clinte: ");
        obj.setNomeCliente(scan.nextLine());
        System.out.println("Valor do Blu-Ray: ");
        obj.setPreco(scan.nextDouble());
    }
    

}
