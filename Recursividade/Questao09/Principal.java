/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao09;

/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String[] args) {
        
        numerosNaturais(7);
    }
    


   public static void numerosNaturais(int n){
  
  
  if (n>0){
   numerosNaturais(n-1);
   if(n>0){    
    System.out.println(n);
   }  
 }
   
 }
}
    

