/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

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
        // TODO code application logic here
         boolean continua=false;
         int[]x =new int[10];
        do{
        try{        
        for(int i=0; i<x.length;i++){
            x[i]=i;
        }
        //laçoparapreencheroarray
        for (int i=0; i<=x.length; i++){
            JOptionPane.showMessageDialog(null, x[i]);
        }
        }
    catch (ArrayIndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(null, "Array possui apenas "+x.length+" posições.");
        continua = false;
    }
    
}while(continua);
        //laçoparamostraroarray
    }
}
