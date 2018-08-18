/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02_03_04;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author rafael
 */
public class EmpregadoTeste {
    public static void main (String []agr){
        ArrayList<Empregado> list = new ArrayList<Empregado>();
        String x;
        x = JOptionPane.showInputDialog("Escolha a opção: \n 1-Cadastro \n 2-Mostrar Cadastros \n 3-Sair");
        do
           
        switch(x){
            case "1":
                String n1 = JOptionPane.showInputDialog("Digite o Nome");
                int n2 =Integer.parseInt(JOptionPane.showInputDialog("Digite o Idade"));
                Double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Altura"));
                String n4 = JOptionPane.showInputDialog("Digite o Sexo");
                Double n5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario"));
                Empregado p = new Empregado(n1,n2,n3,n4,n5);
                
                list.add(p);
                break;
                
            case "2":
                int cont = list.size();
                for(int i=0;i<cont;i++){
                JOptionPane.showMessageDialog(null, list.get(i).toString());
                
                        }
                        break;
                
            case "3":
                JOptionPane.showMessageDialog(null,"Programa encerrado \n Volte Sempre");
                break;
                
        }
      
        while(x=="3");
        int cont = list.size();
                for(int i=0;i<cont;i++){
                JOptionPane.showMessageDialog(null, list.get(i).toString());
        
    }
    }}
