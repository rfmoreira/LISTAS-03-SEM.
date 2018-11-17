/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao04;

/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String[] args) {
        LinkedIntList l1 = new LinkedIntList();
        LinkedIntList l2 = new LinkedIntList();
        LinkedIntList l3 = new LinkedIntList();
        
        for(int i = 10; i>0 ; i--){
            l1.addFirst(i);  
        }
        for(int i = 0; i<10 ; i++){
            l2.addFirst(i);  
        }
        
        
        l1.verifElement(11);
        
        l1.add(56, 6);
        
        l1.remove(6);
       
        l1.print();
        System.out.println("");
        
        l3.copyList(l1, l3);
        
        l3.print();
        
        System.out.println("");
        
        l1.concatenarList(l1, l2);
        
       l1.print();
       
        
    }
    
}
