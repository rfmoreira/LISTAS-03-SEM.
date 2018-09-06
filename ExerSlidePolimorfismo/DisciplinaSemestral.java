/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerSlide;

/**
 *
 * @author aluno
 */
public class DisciplinaSemestral extends Disciplina{
    private float nota3;

    public DisciplinaSemestral(float nota3, String nome, String periodo, float nota1, float nota2) {
        super(nome, periodo, nota1, nota2);
        this.nota3 = nota3;
    }

    
    @Override
    public double avaliarDisciplina() {
        return (nota1+nota2+nota3)/3;
    }
    
    
}
