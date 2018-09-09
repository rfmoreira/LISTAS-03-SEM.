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
public class Pricipal01 {
    public static void main(String[]arg){
    Cachorro c1 = new Cachorro("Tody");
   
    /*JOptionPane.showMessageDialog(null,  c1.late());
    JOptionPane.showMessageDialog(null, c1.caminha());
    Gato g = new Gato("Satan");
    JOptionPane.showMessageDialog(null,  g.mia());
    JOptionPane.showMessageDialog(null,  g.caminha());
    */
    Pobre p = new Pobre("Pedro",22);
    p.trabalha();
   } 
}
