/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

/**
 *
 * @author aluno
 */
public class Celular extends Telefones{
    private String tipo;
    private String tela;
    
    public Celular (String cor, String formato, String tipo,String tela,int numero){
        super(cor, formato, numero);
        this.tela = tela;
        this.tipo = tipo;
        
    }
}
