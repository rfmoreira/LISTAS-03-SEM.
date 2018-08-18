/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao02_03_04; //Questão 03

/**
 *
 * @author rafael
 */
public class Fornecedor extends Pessoa{
    private double creditoMaximo;
    private double valorEmDivida;
    
    public Fornecedor(String nome,int idade,double altura,String sexo,double creditoMaximo, double valorEmDivida){
        super(nome,idade,altura,sexo);
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    
    public double obterSaldo(){
        return creditoMaximo - valorEmDivida;
        
    }
    
    @Override
    public String toString() {
        return "Cadastro do Fornecedor" +"\nNome: "+ nome + "\nIdade: "+idade+ "\nAltura: "+altura + 
                "\nSexo: "+sexo+ "\nSaldo Diponivel: " + obterSaldo();
}}


