/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contacorrente> listaconta = new ArrayList<Contacorrente>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 2; i++) {
            Contacorrente nvconta = new Contacorrente();
            System.out.println("Digite o nome:");
            nvconta.setNome(input.next());
            System.out.println("Digite o valor de deposito :");
            nvconta.deposito(input.nextDouble());
            listaconta.add(nvconta);
            System.out.println("");
            System.out.println("");
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println(listaconta.get(i).getNome());
            System.out.println(listaconta.get(i).getSaldo());
            System.out.println(listaconta.get(i).getStatus());
            System.out.println(listaconta.get(i).getLimite());
            
            System.out.println("");
            System.out.println("");

        }
    }
}
