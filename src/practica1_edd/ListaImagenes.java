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
public class ListaImagenes {
    
    String direccion;
    
    public ListaImagenes(String direccion)
    {
        this.direccion=direccion;
    }
    public String getImagen()
    {
        return this.direccion;
    }
    public void setImagen(String img)
    {
        this.direccion=img;
    }
}
