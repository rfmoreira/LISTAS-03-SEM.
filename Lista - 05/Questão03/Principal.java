/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão03;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String[] arg) {

        String x = JOptionPane.showInputDialog("Digite Qual tipo de ingresso \n"
                + "1 - Normal \n 2 -  VIP");
        switch (x) {
            case "1":
                Normal n = new Normal();

                JOptionPane.showMessageDialog(null, n.imprime());

                break;
            case "2":
                String x1 = JOptionPane.showInputDialog("Digite Qual tipo de ingresso \n"
                        + "1 - Camarote Superior \n 2 -  Camarote Inferior");

                switch (x1) {
                    case "1":
                        CamaroteSuperior cs = new CamaroteSuperior();
                        JOptionPane.showMessageDialog(null, cs.localizacao() + "\n Valor: " + cs.imprimeValor());
                        break;

                    case "2":
                        CamaroteInferior ci = new CamaroteInferior();
                        JOptionPane.showMessageDialog(null, "\n Valor: " + ci.imprimeValor());
                        break;
                        



                }
        }

    }
}
