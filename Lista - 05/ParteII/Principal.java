/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteII;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String[] arg) {
        ArrayList<Produto> carrinho = new ArrayList();
        String[] s = new String[5];

        for (int x = 0; x != 4;) {
            x = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "Esntre com a opção desejada \n 1 - Livro \n 2 - Mouse \n 3 - Ver Carrinho"));
            switch (x) {
                case 1:

                    Livro l = new Livro("WalmirMart", 25.00, "Jeremias");
                    carrinho.add(l);

                    JOptionPane.showMessageDialog(null, "Adicionado ao Carrinho com sucesso");
                    break;
                case 2:
                    Mouse m = new Mouse("WalmirMart", 50.00, "Fodão");
                    carrinho.add(m);
                    JOptionPane.showMessageDialog(null, "Adicionado ao Carrinho com sucesso");
                    break;

                case 3:
                    for (int i = 0; i <= carrinho.size(); i++) {
                        JOptionPane.showMessageDialog(null, carrinho.get(i).getDescricao());                        
                    }
                    break;

            }

        }





    }
}
