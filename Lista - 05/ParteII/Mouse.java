/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteII;

/**
 *
 * @author rafael
 */
public class Mouse extends Produto{
    private String tipo;

    public Mouse( String nomeLoja, double preco, String tipo) {
        super(nomeLoja, preco, "Optico, USB");
        this.tipo = tipo;
    }
    
    public String getDescricao(){
        return "Nome da Loja: "+ nomeLoja +"\nPreço: "+this.preco+
                "\n Tipo: "+this.tipo+"\nDescrição: "+this.descricao;
    }
    
    
}
