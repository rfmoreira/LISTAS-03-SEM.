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
public class Node {
    Object val;
    Node prev;
    Node next;
    int prio;

    public Node(Object val, Node prev, Node next, int prio) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.prio = prio;
    }
    
    
}
