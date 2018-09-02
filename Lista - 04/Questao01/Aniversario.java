/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

/**
 *
 * @author rafael
 */
public class Aniversario extends CartaoWeb {
    
    public Aniversario(String destinatario){
        this.destinatario = destinatario;
    }
    
    
    public String retornarMenssagem(String remetente){
        return "Feliz Aniversário "+this.destinatario+"!!!\n Muitos Anos de Vida \n Ass.:"+ remetente;
    }
}
