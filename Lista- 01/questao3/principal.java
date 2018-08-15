/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class principal {
    public static void main (String [] arg){
     Scanner input  = new Scanner (System.in);
      
     /**Porta p = new Porta();
     
     p.porta(false,"Azul", 2.7, 2.8,3.5);
     
        System.out.println(p.estaAberta());
        System.out.println(p.getCor());
       */ 
        
     Edificio ed = new Edificio();
     Porta p = new Porta();
     
     for(int i=0; i<6;i++){
         System.out.println("Abrir porta?");
         boolean n1 = input.nextBoolean();
         System.out.println("Cor?");
         String n2 = input.next();
         p.porta(true, "Azul", 3, 4, 5);
         ed.adicionaPorta(p);
     }
     
        System.out.println(ed.portasAbertas());
    }
    
}
