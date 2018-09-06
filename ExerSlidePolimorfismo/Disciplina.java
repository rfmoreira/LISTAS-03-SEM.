/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerSlide;

/**
 *
 * @author aluno
 */
public abstract class  Disciplina {
    protected String nome;
    protected String periodo;
    protected float nota1,nota2;

    public Disciplina(String nome, String periodo, float nota1, float nota2) {
        this.nome = nome;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    
    
    public abstract double avaliarDisciplina();
}
