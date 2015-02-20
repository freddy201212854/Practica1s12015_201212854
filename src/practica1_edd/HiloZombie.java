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
 * @author freddy
 */
public class HiloZombie implements Runnable{
    static Thread objetoHilo2;
    static int contad2=0,CantPersonajes2;
    boolean done=false;
    Tablero t;
    public static void empezarHilo2(){
        objetoHilo2=new Thread(new Hilo());
     	objetoHilo2.start();
    }
    public static void suspenderHilo2(){
        objetoHilo2.suspend();
    }
    public static void resumirHilo2(){
        objetoHilo2.resume();
    }
    @Override
    public void run() {
      
      while(!done){ 
       
         int random=(int) (Math.random()*CrearZombies.imagenesZombies.size());
         int n=random+1;
         // System.out.println("cantidad: "+Plantas.Cantidad+"contadorPer: "+(CantPersonajes)+"cont: "+contad);
         
          if(contad2<CrearZombies.imagenesZombies.size()&&contad2!=-1){
            MontarImagenes(CrearZombies.imagenesZombies.get(random));
          }if(contad2==CrearZombies.imagenesZombies.size()){
              
                  contad2=-1;         
          }if(CantPersonajes2-2==Zombies.CantidadZombie){
              //objetoHilo.suspend();
              done=true;
          }
          
       try {
              objetoHilo2.sleep(1000);
          } catch (InterruptedException ex) {
              Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
          }
         contad2++;
         CantPersonajes2++;
         }
      }
    public void MontarImagenes(String img)
    {
            String path="/imagenes/"+img;
            URL url=this.getClass().getResource(path); 
            Tablero.pZombie(url);
    }
   
}
