
package javaapplication6;


public class Mapa {

    
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(" Ramon ", " 34635737 ", " Jooj "); 
        Ingresso ingresso2 = new Ingresso(" Joao ", " 32134135 ", " Jaaj ");
        Ingresso ingresso3 = new Ingresso(" Maria ", " 326463545 ", "Jiij ");
        
        
        
        Evento evento = new Evento(" Lollapalooza ", " 23/12/2003 ");
        evento.venderIngresso(ingresso1);
        evento.venderIngresso(ingresso2);
        evento.venderIngresso(ingresso3);
        
        
       
        evento.MostrarResumo();
       
       
       
       
    }
    
}
