/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteII;

/**
 *
 * @author rafael
 */
public class Livro extends Produto {
    private String autor;
    
    public Livro (String nomeLoja, double preco, String autor){
        super(nomeLoja, preco, "Juvenal");
        this.autor = autor;
    }
    
    public String getDescricao(){
        return "Nome da Loja: "+ nomeLoja +"\nPreço: "+this.preco+
                "\n Autor: "+this.autor+"\nDescrição: "+this.descricao;
    }
}
