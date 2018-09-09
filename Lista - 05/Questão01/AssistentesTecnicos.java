/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão01;

/**
 *
 * @author rafael
 */
public class AssistentesTecnicos extends Assistente{
    private boolean bonusSalarial;

    public AssistentesTecnicos(boolean bonusSalarial, String numeroDeMatricula, String nome) {
        super(numeroDeMatricula, nome);
        this.bonusSalarial = bonusSalarial;
    }

    
    
    public String exibeDados(){
        return "Recebe Bônus: "+bonusSalarial;
    }
    
}
