/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02;

/**
 *
 * @author rafael
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedIntList l1 = new LinkedIntList();
        LinkedIntList l2 = new LinkedIntList();
       
        for(int i = 10; i>0 ; i--){
            l1.addFirst(i);  
        }
        for(int i = 0; i<10 ; i++){
            l2.addFirst(i);  
        }
        
        l2.interList(l1, l2);
        
        l2.print();
        
        
         /*
        //Copiar Lista
        l2.copList(l1, l2);        
        l2.print();        
        System.out.println("");        
        l1.print();
        
        
        
        
        for(int i = 10; i>0 ; i--){
            l2.addFirst(i);  
        }
        // Concatenar Lista
         l1.concList(l2);
         
         //Imprimir determinado elemento da Lista
         for(int i = l1.size()-1; i>0; i--){
            int c = l1.get(i);
          if(c == 20){
                System.out.println(l1.get(i));
          }
        }
        System.out.println(l1.size());
        
        
        l1.print();
        System.out.println("");
        
        
        System.out.println(l1.size());*/
        
    }
    
}
