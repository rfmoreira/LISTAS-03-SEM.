/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

/**
 *
 * @author aluno
 */
public class Cachorro extends Animal{
    private String nome;
    private String raça;
    
    public Cachorro(String nome, String raça, String tipo, String cor){
        super(tipo,cor);
        this.nome = nome;
        this.raça = raça;
            
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "nome=" + nome + ", raça=" + raça + '}';
    }
    
    
    
    
}
