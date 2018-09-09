/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão03;

/**
 *
 * @author rafael
 */
public class Vip extends Ingresso{
    
    protected double adicionalVip = 50;
    
    public double imprimeValor(){
        return this.valor+this.adicionalVip;
    }
}
