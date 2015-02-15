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
public class Personajes {
    
    String Nombre;
    int PtsAtaque;
    int PtsDefensa;
    String TipoDisparo;
    
    public Personajes(String Nombre,int PtsAtaque,int PtsDefensa,String TipoDisparo)
    {
        this.Nombre=Nombre;
        this.PtsAtaque=PtsAtaque;
        this.PtsDefensa=PtsDefensa;
        this.TipoDisparo=TipoDisparo;
    }
    
    public String getNombre()
    {
        return this.Nombre;
    }
    public void setNombre(String nombre)
    {
        this.Nombre=nombre;
    }
    public int getAtaque()
    {
        return this.PtsAtaque;
    }
    public void setAtaque(int ataque)
    {
        this.PtsAtaque=ataque;
    }
    public int getDefensa()
    {
        return this.PtsDefensa;
    }
    public void setDefensa(int defensa)
    {
        this.PtsDefensa=defensa;
    }
    public String getDisparo()
    {
        return this.TipoDisparo;
    }
    public void setDisparo(String disparo)
    {
        this.TipoDisparo=disparo;
    }
}
