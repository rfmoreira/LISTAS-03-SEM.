/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao05;

/**
 *
 * @author rafael
 */
public class Principal {

    
   public static void main(String[] args) {
        
        int result = soma(5);
        System.out.println(result);
    }
    public static int soma(int n){
        if(n > 0){
            return n + soma(n-1);
        }
        return 0;
        
    }
}
