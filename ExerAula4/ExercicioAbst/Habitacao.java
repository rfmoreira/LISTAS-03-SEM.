/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAbst;

/**
 *
 * @author aluno
 */
public abstract class Habitacao {
    protected int numeroDeComodos;
    protected String endereço;
    
    
    public abstract double calcularIptu(double valor);
            
    
}
