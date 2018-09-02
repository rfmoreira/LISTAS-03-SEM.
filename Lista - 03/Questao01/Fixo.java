/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

/**
 *
 * @author aluno
 */
public class Fixo extends Telefones{
    private boolean baseFixa;
    private boolean precisaDeEnergia;
    
    public Fixo (String tipo, String formato, int numero,boolean baseFixa, boolean precisaDeEnergia){
         super(tipo,formato,numero);
         this.baseFixa = baseFixa;
         this.precisaDeEnergia = precisaDeEnergia;
    }
           
   

            }
