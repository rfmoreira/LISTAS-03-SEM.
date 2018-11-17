/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao04;

/**
 *
 * @author rafael
 */
public class LinkedIntList {

   ListNode last;
   ListNode first;
   int size;
   
   public LinkedIntList(){
       last = null;
       first= null;
       size = 0;
   }
   
   public void addFirst(int val){
       
       first = new ListNode(val, last, first);
       size++;
   }
   
   public void add(int val, int index){
       ListNode cursor = first;
       for(int i=0; i<index-1; i++){
           cursor = cursor.next;
       }
      ListNode novo = new ListNode(val, cursor, cursor.next);
      novo.next.prev = novo;
      cursor.next=novo;
      size ++;
   }
   
   public void remove(int index){
       ListNode cursor = first;
       for(int i=0; i<index-1;i++){
           cursor = cursor.next;
       }
       cursor.next = cursor.next.next;
       cursor.next.next.prev = cursor;
       size--;
   }
   
   public void addLast(int val){
       last.next = new ListNode(val, last, first);
       size++;
   }
   
   public void removeFirst(){
       first.next.prev = last;
       first = first.next;
       size--;
   }
   
   public void removeLast(){
       last.prev.next = first;
       first.prev = last.prev;
       size--;
   }
   
   public void print(){
       ListNode cursor = first;
       while(cursor != last){
           System.out.println(cursor.val);
           cursor = cursor.next;
       }
       
   }
   
   public int get(int index){
       ListNode cursor = first;
       for(int i=0; i<=index;i++){
           cursor = cursor.next;
       }
       return cursor.val;
   }
   
   
   public void verifElement(int val){
       ListNode cursor = first;
       for(int i=0; i<size-1;i++){
           if(val == cursor.val){
               System.out.println("Valor existente na posição " + i);
           }
           cursor = cursor.next;
       }
   }
   
   public void copyList(LinkedIntList l1, LinkedIntList l2){
       
      l2.first= l1.first;
      l2.last = l1.last;
        //for(int i=0; i<l1.size-1;i++){
       //l2.addFirst(l1.get(i));
       //}
   }
 
   public void concatenarList(LinkedIntList l1, LinkedIntList l2){
       l1.last.next = l2.first;
       l2.first.prev = l1.last;
       l2.last.next = l1.first;
       l1.first.prev = l2.last;
       l1.last = l2.last;
   }
   
}
