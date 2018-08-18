/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02_03_04;

/**
 *
 * @author rafael
 */
public class Administrador extends Empregado{
    private double ajudasDeCusto;
    
    public Administrador(String nome,int idade,double altura,String sexo, double salario,double ajudaDeCusto){
        super(nome,idade,altura,sexo,salario);
        this.ajudasDeCusto = ajudaDeCusto; 
        
    }

    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }
    
    public double obterLucros(){
        return salario+ajudasDeCusto;
    }
    @Override
    public String toString() {
        return "Empregado Adiministrador" +"\nNome: "+ nome + "\nIdade: "+idade+ "\nAltura: "+altura + 
                "\n Sexo: "+sexo+ "\n Salario: " + obterLucros();
    }
}
