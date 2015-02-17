/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KRATOS
 */
public class Hilo implements Runnable {
    static Thread objetoHilo;
    static int contador=0;
    boolean done=false;
    public static void empezarHilo(){
        objetoHilo=new Thread(new Hilo());
     	objetoHilo.start();
    }
    public static void suspenderHilo2(){
        objetoHilo.suspend();
    }
    public static void resumirHilo2(){
        objetoHilo.resume();
    }
    @Override
    public void run() {
      while(!done){ 
       
         
          System.out.println(contador);
          //Tablero.prue.setText(String.valueOf(contador));
         // Tablero.label.setText(String.valueOf(contador));
         // Tablero.p();
          try {
              objetoHilo.sleep(1000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
          }
         contador++;
         }
	
	
	
      }
    
    
    
    
    
}
