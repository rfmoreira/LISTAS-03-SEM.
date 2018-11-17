/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

import java.util.EmptyStackException;

/**
 *
 * @author rafael
 */
public class LinkedIntList {

    private ListNode first;
    private int size;

    public LinkedIntList() {
        first = null;
        size = 0;
    }

    LinkedIntList(LinkedIntList l) {
        first = l.getFirst();
        size = l.size();
    }

    public ListNode getFirst() {
        return first;
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        ListNode cursor = first;

        while (cursor != null) {
            System.out.println(cursor.val);
            cursor = cursor.next;
        }

    }

    public void addFirst(int v) {
        first = new ListNode(v, first);
        size++;
    }

    public void add(int v, int index) {
        if (index == 0) {
            first = new ListNode(v, first);
        } else {
            ListNode cursor = first;

            for (int i = 0; i < index - 1; i++) {
                cursor = cursor.next;
            }

            cursor.next = new ListNode(v, cursor.next);
        }
        size++;
    }

    public void removeFirst() {
        first = first.next;
        size--;
    }

    public void remove(int index) throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        }
        
        if(index == 0){
            first = first.next;
        }else{
            ListNode cursor = first;
            
            for(int i=0; i<index-1; i++){
                cursor = cursor.next;
            }
            cursor.next= cursor.next.next;
        }
        size--;
    }
    
    public int get(int index){
        ListNode cursor = first;
        for(int i = 0; i< index;i++){
            cursor = cursor.next;
        }
        return cursor.val;
    }

}
