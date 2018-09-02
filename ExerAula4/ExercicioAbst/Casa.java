/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAbst;

/**
 *
 * @author aluno
 */
public class Casa extends Habitacao{
    private double tamanhoQuintal;
    
    public Casa(int numeroDeCComodos, String endereco,double tamanhoQuintal){
        this.numeroDeComodos = numeroDeCComodos;
        this.endereço = endereco;
        this.tamanhoQuintal = tamanhoQuintal;
    }
    
    public double calcularIptu(double valor){
        return valor;
    }
   
    


}
