/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerSlide;

/**
 *
 * @author aluno
 */
public class DisciplinaTrimestral extends Disciplina{

    public DisciplinaTrimestral(String nome, String periodo, float nota1, float nota2) {
        super(nome, periodo, nota1, nota2);
    }

    
    @Override
    public double avaliarDisciplina() {
        return (nota1*0.4)+(nota2*0.6);
    }
    
    
    
}
