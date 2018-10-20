/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao06;

import java.util.Arrays;

/**
 *
 * @author rafael
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Integer [] f = new Integer[50];
        int cont = 2;
        for(int i = 0; i < 50; i++){
            
            f[i] = cont + i;
        }
        
        inversao(f, 0, f.length-1);
        System.out.println(Arrays.toString(f));
        
        
        
    }
    
    public static double inversao(Integer[] f, int i,int fim){
              
        if(i< fim){
            trocar(f,i,fim); 
            inversao(f, i+1, fim-1);
             
        }else{
            return 0;
        }
        return 0;
    }

    private static void trocar(Integer[] f, int i, int fim) {
        int aux = f[i];
        f[i] = f[fim];
        f[fim] = aux;
    }

   
    
}
