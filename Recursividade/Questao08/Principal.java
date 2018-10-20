/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao08;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 5;
        int n2 = 5;
        
        System.out.println(mult(n1, n2));
        
    }
    
    public static int mult(int n1, int n2){
        if(n2 > 0){
            return n1+ mult(n1, n2-1);
        }
         return 0;
        
    }
    
}
