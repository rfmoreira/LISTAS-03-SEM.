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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedIntList l1 = new LinkedIntList();
        LinkedIntList l2 = new LinkedIntList();
        
        
        l1.addFirst("google", "google.com.br");
        l1.addFirst("facebook", "facebook.com.br");
        l1.addFirst("orkut", "orkut.com.br");
        
        //l1.print();
        l1.getNomeFist("google");
        
        l1.print();
        
    }
    
    
}
