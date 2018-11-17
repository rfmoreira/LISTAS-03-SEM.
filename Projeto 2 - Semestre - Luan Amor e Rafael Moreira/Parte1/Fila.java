/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;

/**
 *
 * @author aluno
 */
public class Fila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilaUnieuro<Integer> l = new FilaUnieuro<>();
        
        l.add(22, 3);
        l.add(60, 3);
        l.add(45, 3);
        l.add(22, 2);
        l.add(60, 2);
        l.add(45, 2);
        l.add(22, 1);
        l.add(60, 1);
        l.add(45, 1);
        
       /* for(int i=5; i>0; i--){
            l.add(i, 2);
        }
        for(int i=5; i>0; i--){
            l.add(i, 1);
        }

        for(int i=5; i>0; i--){
            l.add(i, 3);
        }*/
        //l.print();
       
        
    
        l.remove(3);
        
         l.printRec();
        
       
    }
    
}
