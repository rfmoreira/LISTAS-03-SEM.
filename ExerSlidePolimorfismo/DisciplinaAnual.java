/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerSlide;

/**
 *
 * @author aluno
 */
public class DisciplinaAnual extends Disciplina{
    double nota3,nota4,nota5,nota6;

    public DisciplinaAnual(double nota3, double nota4, double nota5, double nota6, String nome, String periodo, float nota1, float nota2) {
        super(nome, periodo, nota1, nota2);
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }
    
    
    @Override
    public double avaliarDisciplina() {
        return (nota1+nota2+nota3+nota4+nota5)/5*0.6+(nota6*0.4);
    }
    
    
    
}
