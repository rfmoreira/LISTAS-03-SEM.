/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão02;

/**
 *
 * @author rafael
 */
public abstract class Animal {
    private String nome,reca;
    
    public Animal(){
        
    }
    public Animal(String nome){
        this.nome = nome;       
    }
    
    public abstract String caminha();
        
    
    
}
