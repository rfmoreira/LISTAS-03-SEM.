/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão01;
import javax.swing.JOptionPane;
/**
 *
 * @author rafael
 */
public class Principal {
    public static void main (String[]arg){
        
        //Funcionario[] f = new Funcionario[2];
        
        TecnicoAdministrativo s = new TecnicoAdministrativo("Rafael", "01","Matutino",true);
        
       AssistentesTecnicos t = new AssistentesTecnicos(true,"Daniel","02");
    
        JOptionPane.showMessageDialog(null,s.nome+"\n"+ s.getNumeroDeMatricula()+"\n"+ s.exibeDados());
        
        JOptionPane.showMessageDialog(null, t.nome+"\n"+t.getNumeroDeMatricula()+"\n"+t.exibeDados());
                
}
    
}
