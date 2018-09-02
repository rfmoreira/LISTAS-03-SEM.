/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioAbst;

/**
 *
 * @author aluno
 */
public class Apartamento extends Habitacao{
    
    private double valorCondominio;

    public Apartamento(int numeroDeCComodos, String endereco,double valorCondominio) {
    this.numeroDeComodos = numeroDeCComodos;
    this.endereço = endereco;
    this.valorCondominio = valorCondominio;
    }
    
    public double calcularIptu(double valor){
        return valor;
    }
    
}
