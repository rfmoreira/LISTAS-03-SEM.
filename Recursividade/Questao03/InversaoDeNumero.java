/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao03;

/**
 *
 * @author rafael
 */
public class InversaoDeNumero {
 
    
    public static int inverte(int n, int s){
        if (n == 0){
            return s;
        }
        
        return inverte(n/10, s * 10 + n%10);
    }
    
}
