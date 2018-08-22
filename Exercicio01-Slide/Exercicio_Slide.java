/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] i = new int[10];
        String[] s = new String[10];
      
        
        
        s[0] = JOptionPane.showInputDialog(null,"Digite o nome");
        
        i[0]= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Idade"));
        
         if(i[0] > 18){
         JOptionPane.showMessageDialog(null,s[0]+" Você pode Tirar CNH","Resposta",JOptionPane.QUESTION_MESSAGE);
         }else{
             JOptionPane.showMessageDialog(null,s[0]+"Você ainda não pode tira CNH, você tem apenas"+i[0],"Resposata",JOptionPane.WARNING_MESSAGE);
         }
         
         }
}
