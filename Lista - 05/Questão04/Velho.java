/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão04;

/**
 *
 * @author rafael
 */
public class Velho extends Imovel{
    
    private double desconto;

    public Velho(String end, double valor,double desconto) {
        super(end, valor);
        this.desconto = desconto;
    }
    
    
    
    public double valorDesconto(){
        return this.preco - this.desconto;
    }
}
