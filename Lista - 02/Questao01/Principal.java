/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[]arg){
        Scanner input = new Scanner (System.in);         
       ArrayList<Cocker> c = new ArrayList<Cocker>();
               
                
        String x;
        x = JOptionPane.showInputDialog("Digite o valor de uma opção:\n 1-Cadastro \n 2-Excluir","Digite 1 ou 2");
        switch(x){
            case "1":
                String n1;
                n1 = JOptionPane.showInputDialog("Digite tipo");
                String n2;
                n2 = JOptionPane.showInputDialog("Digite cor");
                String n3;
                n3 = JOptionPane.showInputDialog("Digite nome");
                String n4;
                n4 = JOptionPane.showInputDialog("Digite raça");
                Cocker a = new Cocker(true, n1, n2, n3, n4);
                c.add(a);
            break;
            case "2":
                n1 = JOptionPane.showInputDialog("Você deseja realmente excluir seu cadastro ?","Digite sim ou nao");
                if(n1=="sim"){
                    c.remove(1);
                }else{
                    JOptionPane.showMessageDialog(null, "Cancelado");
                }
                
        }
        int s=c.size();
        for(int i=0; i<s ;i++){
            JOptionPane.showMessageDialog(null, c.get(i).toString());
            JOptionPane.showMessageDialog(null, c.get(i).getTipo(), x, i);
        }
    }
}
        
        
       
    

