/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão02;

/**
 *
 * @author rafael
 */
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nome) {
        super(nome);
    }
    
    
    public String caminha(){
        return "Sonhei que andei, andei, andei, andei\n"
                + "Andei que cansei, cansei, cansei, cansei\n"
                + "Cansei que Sentei, sentei, sentei, sentei\n"
                + "Sentei que deitei, deitei, deitei, deitei\n"
                + "Deitei que dormi, dormi, dormi, dormi, dormi\n"
                + "Dormi que sonhei, sonhei, sonhei, sonhei ";
    }

    public String mia(){
        return "Meouu";
    }
}

