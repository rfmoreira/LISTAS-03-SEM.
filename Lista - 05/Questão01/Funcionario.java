/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão01;

/**
 *
 * @author rafael
 */
public abstract class  Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    
    
    
    
   public abstract String exibeDados();
    
}
