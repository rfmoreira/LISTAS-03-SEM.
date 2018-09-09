/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão03;

/**
 *
 * @author rafael
 */
public class CamaroteSuperior extends Vip{
    private String localIngresso = "Camarote Superior";
    
    
    public String localizacao(){
        return this.localIngresso;
    }
    
    public double imprimeValor(){
        return this.valor+this.adicionalVip;
    }
}
