/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author KRATOS
 */
public class ListaDoble {
    static String nombres,tipos,imgs,textos,textos2="Zombies",textos3="Plantas";
    static int ataques,defensa,size,cont,contador=1;
    NodoDoble cabeza;
    NodoDoble foto;
    public ListaDoble()
    {
        cabeza=null;
    }
    public void insertarCabezaLista(Object entrada)
        {

            NodoDoble nuevo;
            nuevo = new NodoDoble(entrada);
            nuevo.adelante = cabeza;
            if (cabeza != null)
                cabeza.atras = nuevo;
            cabeza = nuevo;
            size++;
        }
       
       public boolean isEmpty()
       {
           return cabeza==null;
       }
        public void eliminar(String entrada)
        {
            NodoDoble actual;
            boolean encontrado = false;
            actual = cabeza;

            while ((actual != null) && (!encontrado))
            {
                Personajes personaje = (Personajes)actual.dato;
                encontrado = (personaje.getNombre().equals(entrada));

                if (!encontrado)
                    actual = actual.adelante;
            }// Enlace de nodo anterior con el siguiente
            if (actual != null)
            {

                //distingue entre nodo cabecera o resto de la lista
                if (actual == cabeza)
                {

                    cabeza = actual.adelante;
                    if (actual.adelante != null)
                        actual.adelante.atras = null;
                }
                else
                    if (actual.adelante != null)
                    {
                        // No es el último nodo

                        actual.atras.adelante = actual.adelante;
                        actual.adelante.atras = actual.atras;
                    }
                    else
                        // último nodo
                        actual.atras.adelante = null;
                actual = null;
            }
        }
        public void editar(String Nombre,int PtsAtaque,int PtsDefensa,String TipoDisparo)
        {
            NodoDoble n;
            n = cabeza;

            while (n != null)
            {
                
                Personajes datos = (Personajes)n.dato;

                if (datos.getNombre().equals(Nombre))
                {
                   // datos.setOponente(oponente);
                    datos.setNombre(Nombre);
                    if(!"-1".equals(String.valueOf(PtsAtaque)))
                    datos.setAtaque(PtsAtaque);
                    if(!"-1".equals(String.valueOf(PtsDefensa)))
                    datos.setDefensa(PtsDefensa);
                    if(!TipoDisparo.equals(""))
                    datos.setDisparo(TipoDisparo);
                }
                n = n.adelante;
            }
        }
     public void visualizar()
    {
    NodoDoble n;
    n = cabeza;
    while (n != null)
        {
        //System.out.print(n.dato + "");
        Personajes datos = (Personajes)n.dato;
        
        System.out.print("nombre: "+datos.getNombre()+" ");
        System.out.print("ataque: "+datos.getAtaque()+" ");
        System.out.print("defensa: "+datos.getDefensa()+" ");
        System.out.println("Tipo: "+datos.getDisparo());


        n = n.adelante;
        }
    }
    public void imprimir(){//imprime los datos de la lista generando su imagen
      if(!isEmpty()){  
            NodoDoble actual=cabeza;
            while(actual!=null)
            { 
                cont++;
                Personajes datos=(Personajes)actual.dato;            
                textos3=textos3+"->"+datos.getNombre();               
                actual=actual.adelante;                  
            }
       System.out.println(textos3);
       generarArchivo(textos3);
       Generar();
       textos3="Plantas";
        }else
            System.out.println("Lista vacia");
       
    }
   
    public static void generarArchivo(String texto)//genera el archivo para genera la imagen de la lista
    {
      FileWriter fichero = null;
      PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph2.txt");
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
           String fileInputPath="C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph2.txt";
           String fileOutputPath="C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph2.png";
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
    //-------------------------------------------------------
    public void imprimir2(){//imprime los datos de la lista generando su imagen
      if(!isEmpty()){  
            NodoDoble actual=cabeza;
            while(actual!=null)
            { 
                contador++;
                Personajes datos=(Personajes)actual.dato;            
                textos2=textos2+"->"+datos.getNombre();               
                actual=actual.adelante;                  
            }
       System.out.println(textos2);
       generarArchivo2(textos2);
       Generar2();
       textos2="Zombies";
        }else
            System.out.println("Lista vacia");
       
    }
   
    public static void generarArchivo2(String texto)//genera el archivo para genera la imagen de la lista
    {
      FileWriter fichero = null;
      PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph3.txt");
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
    public static void Generar2()//Genera la imagen de la lista
    {
        try{
           String dotPath="C:\\Users\\KRATOS\\Downloads\\Compressed\\release\\bin\\dot.exe"; 
           String fileInputPath="C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph3.txt";
           String fileOutputPath="C:\\Users\\KRATOS\\Documents\\NetBeansProjects\\Practica1_EDD\\graph3.png";
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
