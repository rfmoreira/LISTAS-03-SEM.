/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

/**
 *
 * @author aluno
 */
public class Animal {
    protected String tipo;
    protected String cor;

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + ", cor=" + cor + '}';
    }
     
    
}
