/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author aluno
 */
public class Porta {
    private boolean aberta = false;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    public void porta (boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ){
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    public boolean estaAberta(){
    return aberta;
    }
    
}
