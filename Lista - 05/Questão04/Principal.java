/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão04;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String[] arg) {

        String x = JOptionPane.showInputDialog("Digite Qual tipo de imovel \n"
                + "1 - Velho \n2 -  Novo");

        switch (x) {
            case "1":
                Velho v = new Velho("COisa", 100000, 1000);
                JOptionPane.showMessageDialog(null, "Valor final: " + v.valorDesconto());
                break;

            case "2":
                Novo n = new Novo("Coisa02", 120000, 2000);
                JOptionPane.showMessageDialog(null, "Valor final: " + n.valorAdicional());


        }
    }
}
