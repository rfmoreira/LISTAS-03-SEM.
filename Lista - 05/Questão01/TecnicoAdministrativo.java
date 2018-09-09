/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão01;

/**
 *
 * @author rafael
 */
public class TecnicoAdministrativo extends Assistente {
    private String truno;
    private boolean adicionalNorturno;

    public TecnicoAdministrativo(String nome,String numeroDeMatricula, String truno, boolean adicionalNorturno  ) {
        super(numeroDeMatricula, nome);
        this.truno = truno;
        this.adicionalNorturno = adicionalNorturno;
    }

   

   
    
    
    
    public String exibeDados(){
        return this.truno;
    }
}
