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
public class FatorialN {
    
    
    public static int fatorial(int n){
       if(n == 0){
           return 1;
       }         
       
       return n * fatorial(n - 1);
        
    }
    
}
