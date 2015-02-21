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
    static int contad=-1,CantPersonajes=0,CantPersonajes2,contad2=-1;
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
       
         //int random=(int) (Math.random()*CrearPlantas.imagenes.size());
         //int random2=(int) (Math.random()*CrearZombies.imagenesZombies.size());
         // System.out.println("cantidad: "+Plantas.Cantidad+"contadorPer: "+(CantPersonajes)+"cont: "+contad);
            if(contad<CrearPlantas.imagenes.size()&&contad!=-1){
               int random=(int) (Math.random()*CrearPlantas.imagenes.size());
               MontarImagenes(CrearPlantas.imagenes.get(random));
            //MontarImagenesZombies("zombies1.png");
            }if(contad2<CrearZombies.imagenesZombies.size()&&contad2!=-1)
            {
               int random2=(int) (Math.random()*CrearZombies.imagenesZombies.size());
               MontarImagenesZombies(CrearZombies.imagenesZombies.get(random2));
            }         
         
          if(Zombies.CantidadZombie<Plantas.Cantidad)
          {
                           System.out.println("Plantas Cant: "+Plantas.Cantidad+" CantPers: "+CantPersonajes);

            if(contad==CrearPlantas.imagenes.size()-1){ 
               contad=-1;
            }
            if(contad2==CrearZombies.imagenesZombies.size()-1)
            {
                contad2=-1;
            }
            if(Zombies.CantidadZombie==CantPersonajes2)
            {
                contad2=CrearZombies.imagenesZombies.size()+2;
            }
            if(Plantas.Cantidad==CantPersonajes)
            {
                done=true;
            }
            
          }
       /*   if(contad==CrearPlantas.imagenes.size()){ 
              
                  contad=-1;
          }
          if(contad2==CrearZombies.imagenesZombies.size())
          {
            contad2=-1;
          }
          if(CantPersonajes-2==Plantas.Cantidad)
          {
              done=true;
          }
          if(CantPersonajes2==Zombies.CantidadZombie){
              contad2=Zombies.CantidadZombie+2;
          }
         */
          
       try {
              objetoHilo.sleep(1000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
          }
         contad++;
         CantPersonajes++;
         CantPersonajes2++;
         contad2++;
         }
      }
    public void MontarImagenes(String img)
    {
            String path="/imagenes/"+img;
            URL url=this.getClass().getResource(path); 
            Tablero.p(url);
           // Tablero.pZombie(url);
    }
   public void MontarImagenesZombies(String img)
    {
            String path="/imagenes/"+img;
            URL url=this.getClass().getResource(path); 
            Tablero.pZombie(url);
    }
    
}
