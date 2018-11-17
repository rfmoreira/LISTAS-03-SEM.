/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

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
        LinkedIntList l3 = new LinkedIntList();
        
       // int valor = 10;
       for(int i = 10; i> 0; i--){
          // if(l1.empty()){
               l1.addFirst(i);        
           
       }
       l1.print();
       
       for(int i = l1.size(); i>0; i--){
           if(i==l1.size()){
           l2.addFirst(l1.get(0));
           }else{
               l2.addFirst(l1.get(i));
           }
           
       }
       
        System.out.println("");
        
        l2.print();
        
        System.out.println("");
        
        for(int i = 0; i<l1.size(); i++){
            l3.addFirst(l1.get(i)-1);
        }
        
        l3.print();
        
    }
    
  
    
}
