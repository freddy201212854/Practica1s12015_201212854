/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.io.*;

/**
 *
 * @author KRATOS
 */
public class ListaEnlazada {
    static String textos="",txt="";
    static int contador=0;
    ListNode firstNode;
    ListNode lastNode;
    ListNode down;
    ListNode Jugador;
    ListNode node;
    public ListaEnlazada()
    {
        firstNode=null;
        lastNode=null;
        down=null;
    }
    public boolean isEmpty(){// verifica si la lista esta vacia
        return firstNode==null; 
    }
    public void InsertAtFront(Object dato)//inserta el dato al inicio de la lista
    {
     if(isEmpty())
     {
         firstNode=lastNode=down=new ListNode(dato);
     }else{
         firstNode=new ListNode(dato,firstNode);
     }
    }
   
     public void InsertAtBack(Object dato)//inserta el dato al final de la lista
    {
        if(isEmpty())
        {
            firstNode=lastNode=down=new ListNode(dato);
        }else{
            lastNode=lastNode.next=new ListNode(dato);  
        }
    }
     public void unir(Object dato)
     {
         if(isEmpty())
         {
             firstNode=lastNode=down=new ListNode(dato);
         }else{
             down=down.abajo=new ListNode(dato);
         }
     }
     
    public void imprimir(){//imprime los datos de la lista generando su imagen
        if(!isEmpty()){
                
            ListNode actual=firstNode;
            ListNode actual2=firstNode.abajo;
            ListNode actual3=firstNode.jugador;
            while(actual!=null)
            {
                ToDot(actual);
                //System.out.println(actual.dato);
                actual=actual.next;    
            }
            while(actual2!=null)
            {
                ToDot(actual2);
                //System.out.println(actual.dato);
                actual2=actual2.abajo; 
            }
            while(actual3!=null)
            {
                ToDot(actual3);
                //System.out.println(actual.dato);
                actual3=actual3.jugador; 
            }
        }else
            System.out.println("Lista vacia");
    }
    public static String ToDot(ListNode node) {//genera los datos que van en el archivo de texto
            StringBuilder b = new StringBuilder();
            contador++;
          if(contador==1){
              txt="Jugadores->";
          }else{
              txt="";
          }  
            if (node.next != null) {
              //System.out.println(node.dato.toString()+"->"+node.next.dato.toString());
                textos=txt+textos+node.dato.toString()+"->"+node.next.dato.toString()+"\r\n";
                //System.out.println(textos);
            }if(node.abajo!=null){
                textos=textos+node.dato.toString()+"->"+node.abajo.dato.toString()+"\r\n";
                //System.out.println(textos);
            }else{
                generarArchivo(textos);
                System.out.println(textos);
               Generar();
              // textos="";
            }
   
            return b.toString();
        }
    public static void generarArchivo(String texto)//genera el archivo para genera la imagen de la lista
    {
      FileWriter fichero = null;
      PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph.txt");
            pw = new PrintWriter(fichero);
 
            
                pw.println("digraph A{"+"\r\n"+texto+"\r\n"+"}");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    public static void Generar()//Genera la imagen de la lista
    {
        try{
           String dotPath="C:\\Users\\KRATOS\\Downloads\\Compressed\\release\\bin\\dot.exe"; 
           String fileInputPath="C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph.txt";
           String fileOutputPath="C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph.png";
           String tParam="-Tjpg";
           String tOParam="-o";
           
           
           String[] cmd=new String[5];
           cmd[0]=dotPath;
           cmd[1]=tParam;
           cmd[2]=fileInputPath;
           cmd[3]=tOParam;
           cmd[4]=fileOutputPath;
           
           Runtime rt=Runtime.getRuntime();
           rt.exec(cmd);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            
        }
    
    }
}
