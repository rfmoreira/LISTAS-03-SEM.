/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02;

import java.util.Scanner;


/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        System.out.println("Digite a posição do numero de finbonacci");
        int n1 = inp.nextInt();
        for (int i = 0; i<n1; i++){
        System.out.print(SequenciaDeFB.fibonacci(i)+" ");
        }
        
    }
    
}
