/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Principal {
    public static void main (String [] args ){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um numero para saber o fatorial");
        
        //FatorialN n = new FatorialN();
        
        System.out.println(FatorialN.fatorial(input.nextInt()));
        
        
    }
    
}
