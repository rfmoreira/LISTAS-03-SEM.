/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

import Parte1.FilaUnieuro;
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] n = new Integer[10];
        int n1;
        int n2;
        FilaUnieuro<String> f = new FilaUnieuro<>();
        Pilha<Integer> p = new Pilha<>();
        do {
            System.out.println("Escolha a opção \n"
                    + "| 1 - Entrar na Fila |\n"
                    + "| 2 - Menu Atendente |\n"
                    + "| 3 - Sair           |\n");
            n[1] = in.nextInt();
            switch (n[1]) {

                // Adicionar a fila
                case 1:
                    System.out.println("Escolha a priorirade \n"
                            + "| 1 - Maiores de 60 anos e gestante |\n"
                            + "| 2 - Aluno                         |\n"
                            + "| 3 - Professor / Visitante         |\n");
                    n[2] = in.nextInt();
                    System.out.println("Digite seu nome:");
                    String nome = in.next();
                    f.add(nome, n[2]);
                    break;

                // Entrar como atendente
                case 2:
                    do {
                        System.out.println("Escolha a opção \n"
                                + "| 1 - Ver fila                  |\n"
                                + "| 2 - Chamar Proximo da fila    |\n"
                                + "| 3 - Buscar Processo           |\n"
                                + "| 4 - Retirar Processo da pilha |\n"
                                + "| 5 - Sair                      |\n");
                        n[3] = in.nextInt();
                        switch (n[3]) {

                            // Ver Fila
                            case 1:
                                f.printRec();
                                break;

                            // Chamar proximo da fila
                            case 2:
                                System.out.println("Escolha a prioridade \n"
                                        + "| 1 - Maiores de 60 anos e gestante |\n"
                                        + "| 2 - Aluno                         |\n"
                                        + "| 3 - Professor / Visitante         |\n");
                                n[4] = in.nextInt();                                
                                f.remove(n[4]);
                                
                                System.out.println("Escolha o tipo de atendimento\n"
                                + "| 1 - Inscrição    |\n"
                                + "| 2 - Renovação    |\n"
                                + "| 3 - Trancamento  |\n");
                                n[4] = in.nextInt();
                                System.out.println("Digite o numero do processo: ");
                                int proce = in.nextInt();
                                p.push(proce, n[4]);
                                break;

                            // Buscar Processo     
                            case 3:
                                System.out.println("Digite o nome do processo");
                                proce = in.nextInt();
                                p.buscaProcesso(proce);
                                break;

                            // Retirar Processo da pilha
                            case 4:
                                System.out.println("Digite a priorirade do processo");
                                int prio = in.nextInt();
                                p.pop(prio);
                                break;
                        }

                    } while (n[3] != 5);

                    break;
            }
        } while (n[1] != 3);
        
    }
        

       

}
