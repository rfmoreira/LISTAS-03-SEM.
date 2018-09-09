/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão02;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Pobre extends Pessoa{

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }
    
    
    
    public void trabalha(){
        JOptionPane.showMessageDialog(null, "OOOO, Pobre Lascado");
    }
    
}
