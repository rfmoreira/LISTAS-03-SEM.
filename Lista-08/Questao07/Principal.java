/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao07;

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
        
        for(int i = 10; i> 0; i--){         
               l1.addFirst(i);           
       }
        l1.print();
        
        System.out.println("");
        l1.removePar();
        l1.print();
    }
    
}
