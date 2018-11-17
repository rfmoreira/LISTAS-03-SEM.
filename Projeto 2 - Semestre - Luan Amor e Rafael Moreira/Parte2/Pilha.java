/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

/**
 *
 * @author rafael
 */
public class Pilha<E> {
    
    NodeStack last;
    int size;
    
    public int size(){return size;}
    
    public boolean empty(){ return size == 0;}
    
    public void pop(int prio){
         NodeStack cursor = last;
        while (cursor != null) {
            if (cursor.prio == prio) {
                //Elimina apenas o first
                System.out.println("\nProcesso "+cursor.val + " removido da pilha\n");
                if(cursor == last && cursor.prev == null){
                    last = null;
                }else 
                    //Elimina ultimo elemento da fila
                    if (cursor.prev == null) {
                    cursor.next.prev = null;
                } else  //Elimina o primeiro elemento caso tenha mais elemtos na fila
                        if(cursor.next == null){
                last = cursor.prev;
                }
                        //Elimina em qualquer posição da fila
                else{
                    cursor.next.prev = cursor.prev;
                    cursor.prev.next = cursor.next;
                }
                break;
            }
            cursor = cursor.prev;

        }

        size--;
    }
    
    public void push(Object val, int prio){
        if(empty()){
            last = new NodeStack(val, null, null, prio);
                    
        }else {
        NodeStack novo = new NodeStack(val, last, null, prio);    
        last.next = novo;
        last = novo;
        }
        size++;        
    }
    
    public void top(int prio){
        NodeStack cursor = last;
        
        while(cursor != null){
        if(cursor.prio == prio){
            System.out.println("Valor: "+ cursor.val + "Prioridade: "+ cursor.prio);
            break;
        }
        cursor = cursor.prev;
    }
    }
    
    private boolean verificaProcesso(E p){
        NodeStack cursor = last;
        while(cursor != null){
            if(cursor.val == p){
                return true; 
            }
            cursor = cursor.next;
        }
        return false;
    }
    
     public void printRecursivo(NodeStack n) {

        if (n != null) {

            System.out.println("Nome: " + n.val + " Prioridade: " + n.prio);

            printRecursivo(n.prev);
        }

    }

    public void printRec() {
        NodeStack cursor = last;

        printRecursivo(cursor);

    }
    private void recProceso (NodeStack cursor, Object s){
        
        if(cursor.val == s){
            System.out.println("Processo: "+ cursor.val);
    
        }else{
            
            recProceso(cursor.prev, s);
        }
    }
    
    public void buscaProcesso(E s){
        NodeStack cursor = last;
        if(verificaProcesso(s)){
            recProceso(cursor, s);
        }else{
            System.err.println("Numero do processo invalido");
        }
        
    }
}
