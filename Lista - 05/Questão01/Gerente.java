/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão01;

/**
 *
 * @author rafael
 */
public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }

    
    
    
    
    @Override
    public String exibeDados() {
        return this.nome;
    }
    
}
