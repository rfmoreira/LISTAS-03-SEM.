/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão01;

/**
 *
 * @author rafael
 */
public class Assistente extends Funcionario{
    protected String numeroDeMatricula;

    public Assistente(String numeroDeMatricula, String nome) {
        super(nome);
        this.numeroDeMatricula = numeroDeMatricula;
    }
    
    
    
    
    public String exibeDados(){
        return numeroDeMatricula;
    }
    
    public String getNumeroDeMatricula(){
        return this.numeroDeMatricula;
    }
}
