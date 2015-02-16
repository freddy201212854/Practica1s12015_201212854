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
public class ListaDoble {
    static String nombres,tipos,imgs;
    static int ataques,defensa,size,cont;
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
   
}
