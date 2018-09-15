/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao03;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String[] arg) {

        int[] x = new int[10];
        boolean continua = true;
        int i;
        do {
            try {
                i = Integer.parseInt(JOptionPane.showInputDialog("Entre com a posição do array \n De 0 a 9"));

                x[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser guardado"));
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Fora do limite do array");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor digitado não é um numero");
            }
        } while (continua);

    }
}
