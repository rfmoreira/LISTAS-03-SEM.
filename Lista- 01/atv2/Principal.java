/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Principal {
    public static void main (String [] arg){
        Scanner input = new Scanner (System.in);
        
        Pais p1 = new Pais();
        Pais p2 = new Pais();
        Pais p3 = new Pais();
        p1.Pais("Brasil", "DF", 35, "Argentina");
        p2.Pais("Argentina", "Buenos Aires", 10, "Brasil");
        p3.Pais("Brasil", "DF", 35, "Argentina");
        
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p2));
        
        }
        
        public boolean equals(final Pais p1){
            return false;
    } 
    
}
