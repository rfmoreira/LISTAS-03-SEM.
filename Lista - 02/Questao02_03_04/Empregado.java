/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02_03_04;

/**
 *
 * @author rafael
 */
public class Empregado extends Pessoa {
    protected double salario;
    
    public Empregado(String nome,int idade,double altura,String sexo, double salario){
        super(nome,idade,altura,sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double obterLucros(){
        return getSalario();
    }

    @Override
    public String toString() {
        return "Empregado" +"\nnome: "+ nome + "\nIdade: "+idade+ "\nAltura: "+altura + 
                "\n Sexo: "+sexo+ "\n salario: " + salario;
    }
    
    
    
}
