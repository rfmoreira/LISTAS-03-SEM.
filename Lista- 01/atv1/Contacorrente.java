/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Contacorrente {
    private String nome;
    private double saldo;
    private int num;
    private String status;
    private double limite;
    
    public Contacorrente(){
        
        this.saldo = 0;
        this.num = 01;
        this.status = "ativa";
        this.limite = 1000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo (){
        return saldo;
       }
    public void setNum(int num){
        this.num = num;
    }
   public int getNum(){
       return num;
   }
   public void setStatus (String status){
       this.status = status;
   }
   
   public String getStatus (){
       return status;
   }
   
   public void setLimite (double limite){
       this.limite = limite;
   }
   
   public double getLimite (){
       return limite;
   }
   
   public void deposito (double valor){
       setSaldo(valor);
       System.out.println("Operação realizada com sucesso!");
       System.out.printf("Saldo atual: "+getSaldo()); 
   }
   
   public void retirada (double valor){
       if(saldo < 0){
           setLimite(limite-valor);
       }else{
       setSaldo(saldo - valor);
           System.out.println("Operação realizada com sucess !");
           System.out.printf("Saldo atual:"); getSaldo();
       }
   }
       public void pagamento( double valorpg){
           Scanner input = new Scanner (System.in);           
           System.out.println("Efetuar pagamento:");
           System.out.printf("Escolha \n 1-Debito \n 2-Credito\n");
           int x = input.nextInt();
           if(x==1){
               if(getSaldo() == 0){
                   System.out.println("Saldo Indisponivel");
               }else
               setSaldo(this.saldo - valorpg);
               
           }
           if(x==2){
               if(getLimite()<0){
                   System.out.println("Saldo Indisponivel");
               }else
                   setLimite(this.limite - valorpg);
           }   
                    
       }

    void add(ArrayList<Contacorrente> listaconta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   }
   
    

