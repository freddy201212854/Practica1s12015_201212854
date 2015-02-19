/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KRATOS
 */
public class Hilo implements Runnable {
    static Thread objetoHilo;
    static int contad=-1,CantPersonajes;
    boolean done=false;
    Tablero t;
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
       
          
      // CrearPlantas.lista.visualizar();
          System.out.println(contad);
          //Tablero.prue.setText(String.valueOf(contador));
         // Tablero.label.setText(String.valueOf(contador));
          if(contad<CrearPlantas.imagenes.size()&&contad!=-1){
            System.out.println(CrearPlantas.imagenes.get(contad));
            MontarImagenes(CrearPlantas.imagenes.get(contad));
          }else if(contad==CrearPlantas.imagenes.size()){
              
              objetoHilo.suspend();
          }
       
       try {
              objetoHilo.sleep(1000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
          }
         contad++;
         }
      }
    public void MontarImagenes(String img)
    {
            String path="/imagenes/"+img;
            URL url=this.getClass().getResource(path); 
            Tablero.p(url);
    }
    
}
