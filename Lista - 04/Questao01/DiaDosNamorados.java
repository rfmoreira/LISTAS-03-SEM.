/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class DiaDosNamorados extends CartaoWeb{
     
    
    
    public  DiaDosNamorados(String destinatario){
        this.destinatario = destinatario;
    }
    
    public String retornarMenssagem(String remetente){
        
        return this.destinatario+" !!!\nTenha um Feliz Dia dos Namorados - \n Ass.: "+ remetente;
    }
    
}
