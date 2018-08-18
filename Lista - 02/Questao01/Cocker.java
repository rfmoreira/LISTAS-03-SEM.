/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

/**
 *
 * @author aluno
 */
public class Cocker extends Cachorro{
    private boolean tosa;
    
    public Cocker(boolean tosa,String tipo, String cor, String nome, String raça){
        super(tipo,cor,nome,raça);
        this.tosa = tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    public boolean precisaTosa(){
        return tosa;
        }
        
        
    
    
}
