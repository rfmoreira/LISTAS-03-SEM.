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
public class SequenciaDeFB {
    
    
    public static int fibonacci(int n){
        
        if(n < 2){
            return 1;
        }
        
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
