/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão03;

/**
 *
 * @author rafael
 */
public class CamaroteInferior extends Vip{
    private double valorCamInf = 60;
    
    public double imprimeValor(){
        return this.valor+this.adicionalVip+this.valorCamInf;
    }
}
