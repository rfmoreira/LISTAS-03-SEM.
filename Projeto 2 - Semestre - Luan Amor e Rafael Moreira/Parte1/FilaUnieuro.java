/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;

/**
 *
 * @author aluno
 */
public class FilaUnieuro<E> {

    private int size;
    private Node last;
    private Node first;

    public FilaUnieuro() {
        last = first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean Empty() {
        return size == 0;
    }

    private void printRecursivo(Node n) {

        if (n != null) {

            System.out.println("Nome: " + n.val + " Prioridade: " + n.prio);

            printRecursivo(n.next);
        }

    }

    public void printRec() {
        Node cursor = first;

        printRecursivo(cursor);

    }

    public Object peek() {
        return first.val;
    }

    public void remove(int prio) {
        Node cursor = first;
        while (cursor != null) {
            if (cursor.prio == prio) {
                //Elimina apenas o first
                System.out.println(cursor.val + " em antendido");
                if(cursor == first && cursor.next == null){
                first = last = null;
                }else 
                    //Elimina ultimo elemento da fila
                    if (cursor.next == null) {
                    cursor.prev.next = null;
                } else  //Elimina o primeiro elemento caso tenha mais elemtos na fila
                        if(cursor.prev == null){
                first = cursor.next;
                }
                        //Elimina em qualquer posição da fila
                        else{
                    cursor.prev.next = cursor.next;
                    cursor.next.prev = cursor.prev;
                }
                break;
            }
            cursor = cursor.next;

        }

        size--;
    }

    public void print() {
        Node cursor = first;
        while (cursor != null) {
            System.out.println(cursor.val);
            cursor = cursor.next;
        }
    }

    public void add(E n, int prio) {
        if (Empty()) {
            first = last = new Node(n, first, last, prio);
        } else {
            Node novo = new Node(n, null, null, prio);
            last.next = novo;
            novo.prev = last;
            last = novo;
        }
        size++;
    }

}
