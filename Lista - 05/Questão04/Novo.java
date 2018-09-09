/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão04;

/**
 *
 * @author rafael
 */
public class Novo extends Imovel{
    private double addPreco;

    public Novo(String end, double preco,double addPreco) {
        super(end, preco);
        this.addPreco = addPreco;
    }
    
    
    public double valorAdicional(){
        return this.addPreco+this.preco;
    }
}
