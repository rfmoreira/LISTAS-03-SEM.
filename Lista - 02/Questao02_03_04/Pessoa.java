/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02_03_04;

/**
 *
 * @author rafael
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    protected double altura;
    protected String sexo;
    
    public Pessoa(String nome, int idade,double altura,String sexo){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }
    public void setNome(String nome){
      this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    
    
    
}
