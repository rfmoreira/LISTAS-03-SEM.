/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Principal1 {

    public static void main(String[] arg) {

        Principal1 teste = new Principal1();
        int cont = 0;
        float med=0;
        boolean continua = false;
        int x = 0;
        int i=0;

        //for (int i = 0; i < 100;) {
            do {

                try {

                    x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para soma"));
                    teste.verificar(x);
                    
                    cont += 1;
                    
                        i += x;
                    
                    med = i / cont;
                    if (i<100){
                        continua = true;
                    }else{
                        continua = false;
                    }
                } catch (ExcecaoAcimaDeCemException e) {
                    JOptionPane.showMessageDialog(null, e);
                    continua = true;
                }
            } while (continua);



            JOptionPane.showMessageDialog(null, "Quantidade de numeros somados: " + cont
                    + "\nMedia: " + med + "\nSoma: " + i);
        //}

    }

    public void verificar(int x) throws ExcecaoAcimaDeCemException {
        if (x >= 100) {
            throw new ExcecaoAcimaDeCemException("\nNumero inválido, digite um numero menor que 100");
        }
    }
}
