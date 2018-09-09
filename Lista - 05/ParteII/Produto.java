/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteII;

/**
 *
 * @author rafael
 */
public abstract class Produto {
    protected String nomeLoja;
    protected double preco;
    protected String descricao;
    
    public Produto (String nomeLoja, double preco, String descricao){
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.descricao = descricao;
    }
    
    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
        }
    public String getNomeLoja(){
        return this.nomeLoja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return "Produto de Informática";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
