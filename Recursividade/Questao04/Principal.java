/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao04;

/**
 *
 * @author rafael
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i[]= {2,2,2,2,2};
        
       
             int result =   inteiros(i, 0);
             
             System.out.println(result);
        //for(int s=0; s  < 10; s++){
         //   System.out.println(inteiros(i[s], 0));
       // }
    }
    
    public static int inteiros(int i[], int s){
                
        if(s< i.length){
            return i[s] + inteiros(i, s +1);
        }
        return  0;
    }
}
