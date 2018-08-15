/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2;

/**
 *
 * @author rafael
 */
public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private String paisfront;

    public  void Pais(String nome, String capital, double dimensao, String paisfront) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
        this.paisfront = paisfront;
    }
    
   

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public String getPaisfront() {
        return paisfront;
    }

    public void setPaisfront(String paisfront) {
        this.paisfront = paisfront;
    }
    
    public void consulta(){
        System.out.println(getNome());
        System.out.println(getCapital());
        System.out.println(getDimensao());
        System.out.println(getPaisfront());
    }
    
   
}


