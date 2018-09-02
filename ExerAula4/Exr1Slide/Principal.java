/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exr1Slide;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main (String [] args){
        
        Livro l = new Livro();
        l.disponivel();
        l.emAtraso();
        l.emprestado();
        l.reservado();
        
        Revista r = new Revista();
        
        r.disponivel();
        r.emAtraso();
        r.emprestado();
        r.reservado();
        Tese t = new Tese();
             
        t.disponivel();
        t.emAtraso();
        t.emprestado();
        t.reservado();
        
              
        
    }
    
}
