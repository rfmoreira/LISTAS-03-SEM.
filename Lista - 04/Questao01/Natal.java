/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

/**
 *
 * @author rafael
 */
public class Natal extends CartaoWeb {
    
    public Natal (String destinatario){
        this.destinatario =  destinatario;
    }
    public String retornarMenssagem(String remetente){
        return "Querido "+this.destinatario +" \nFeliz Natal \n Ótimas Festas !!!"+remetente;
    }
}
