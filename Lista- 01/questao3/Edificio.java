/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Edificio {
    private String cor;
    private int totalDePortas;
    private int totalDeAndares;
    private ArrayList<Porta> portas = new ArrayList<Porta>();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTotalDePortas() {
        return totalDePortas;
    }

    public void setTotalDePortas(int totalDePortas) {
        this.totalDePortas = totalDePortas;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }
    
    public void pinta(String s){
        setCor(s);
              
    }
    
    public int quatasPortasEstaoAbertas(){
        int x;
        x = this.portas.size();
        return x;
    }
    
    public void adicionaPorta(Porta p){
        this.portas.add(p);
    }
      public int totalDePortas(){
        int x;
        x = this.portas.size();
        return x;
    }
      
      public void adicionaAndar(int x){
          setTotalDeAndares(this.totalDeAndares + x);
      }
      public int totalDeAndares(){
          return totalDeAndares;
      }
      
      public int portasAbertas(){
          int x = this.portas.size();
          int cont=0;
          for(int i=0;i<x;i++){
             boolean y = portas.get(i).isAberta();
              if(y== true){
                  cont +=1;
              }
              
          }
          return cont;
      }
    

}
