/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

/**
 *
 * @author KRATOS
 */
public class ListNode {
    
    Object dato;
    ListNode next,abajo;
    
    public ListNode(Object dato)
    {
        this.dato=dato;
        next=null;
    }
    public ListNode(Object dato, ListNode n)
    {
        this.dato=dato;
        this.next=n;
        this.abajo=n;
        
    }
    
  
}
