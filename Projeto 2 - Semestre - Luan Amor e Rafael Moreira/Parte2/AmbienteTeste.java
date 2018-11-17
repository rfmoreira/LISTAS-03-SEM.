/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

/**
 *
 * @author rafael
 */
public class AmbienteTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha<Integer> p = new Pilha<>();
        
        p.push(5, 2);
        p.push(6, 1);
        p.push(8, 3);
        
        //p.buscarLoop(8);
        
        p.pop(3);
    }
    
}
