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
        
        CartaoWeb[] a = new CartaoWeb[5];
        String s[] = new String[5];
        s[0] = JOptionPane.showInputDialog("Digite o Nome do Destinatario?");
        a[0] = new Natal(s[0]);
        a[2] = new Aniversario(s[0]);
        a[1] = new DiaDosNamorados(s[0]);
        
        s[1] = JOptionPane.showInputDialog("Remetente");
       for(int i =0; i<=a.length;i++){
           
          
           JOptionPane.showMessageDialog(null, a[i].retornarMenssagem(s[1]));
       
       
       
           
        }
    }
}
