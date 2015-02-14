/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import org.omg.CORBA.Environment;

/**
 *
 * @author KRATOS
 */
public class ListaEnlazada {
    
    ListNode firstNode;
    ListNode lastNode;
    ListNode node;
    public ListaEnlazada()
    {
        firstNode=null;
        lastNode=null;
    }
    public boolean isEmpty(){
        return firstNode==null; 
    }
    public void InsertAtFront(Object dato)
    {
     if(isEmpty())
     {
         firstNode=lastNode=new ListNode(dato);
     }else{
         firstNode=new ListNode(dato,firstNode);
     }
    }
    public void InsertAtBack(Object dato)
    {
        if(isEmpty())
        {
            firstNode=lastNode=new ListNode(dato);
        }else{
            lastNode=lastNode.next=new ListNode(dato);  
        }
    }
    public void imprimir(){
        if(isEmpty())
        
            System.out.println("Lista vacia");
            
            ListNode actual=firstNode;
            
            while(actual!=null)
            {
                ToDot(actual);
                //System.out.println(actual.dato);
                actual=actual.next;
                
            }
            System.out.println("\n");
            
    }
     


        public static String ToDot(ListNode node) {
            StringBuilder b = new StringBuilder();
            if (node.next != null) {
             //   b.append("{0}->{1}{2}", node.toString(), node.next.toString());
              //  b.Append(ToDot(node.next));
                System.out.println(node.dato.toString()+"->"+node.next.dato.toString());
            }
   
            return b.toString();
        }
}
