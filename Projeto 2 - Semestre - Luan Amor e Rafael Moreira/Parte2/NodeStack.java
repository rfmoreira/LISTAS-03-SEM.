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
public class NodeStack {
    
    Object val;
    NodeStack prev;
    NodeStack next;
    int prio;
    
    public NodeStack(Object val, NodeStack prev, NodeStack next, int prio){
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.prio = prio;
        
    }
    
}
