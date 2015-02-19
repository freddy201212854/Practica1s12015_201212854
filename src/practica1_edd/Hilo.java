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
    static int contad=-1,CantPersonajes=0;
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
       
         int random=(int) (Math.random()*CrearPlantas.imagenes.size());
         int n=random+1;
          System.out.println("random"+random);
      // CrearPlantas.lista.visualizar();
         // System.out.println(contad);
          //System.out.println("Perosonajes: "+CantPersonajes+" CantidadTotal"+Plantas.Cantidad);
          //Tablero.prue.setText(String.valueOf(contador));
         // Tablero.label.setText(String.valueOf(contador));
          if(contad<CrearPlantas.imagenes.size()&&contad!=-1){
           // System.out.println(CrearPlantas.imagenes.get(contad));
            MontarImagenes(CrearPlantas.imagenes.get(random));
          }else if(contad==CrearPlantas.imagenes.size()){
              
                  contad=-1;         
          }if(CantPersonajes-1==Plantas.Cantidad){
              objetoHilo.suspend();
          }
       
       try {
              objetoHilo.sleep(1000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
          }
         contad++;
         CantPersonajes++;
         }
      }
    public void MontarImagenes(String img)
    {
            String path="/imagenes/"+img;
            URL url=this.getClass().getResource(path); 
            Tablero.p(url);
    }
    
}
